package com.example.desafiopicpayandroid.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafiopicpayandroid.R
import com.example.desafiopicpayandroid.view.adapter.MainAdapter
import com.example.desafiopicpayandroid.viewModel.HomeViewModel

class HomeActivity : AppCompatActivity() {

    private lateinit var viewModel: HomeViewModel

    private val recyclerView: RecyclerView by lazy {
        findViewById(R.id.rvHomeUserList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        viewModel.getUsers()

        setupObservables()
    }

    private fun setupObservables() {
        viewModel.usersLiveData.observe(this, {
            it?.let { users ->
                recyclerView.apply {
                    layoutManager = LinearLayoutManager(this@HomeActivity)
                    adapter = MainAdapter(users) { position ->
                        val intent = Intent(this@HomeActivity, UserPaymentActivity::class.java)
                        intent.putExtra(KEY_INTENT_USER, users[position])
                        startActivity(intent)
                    }
                }
            }
        })
    }

    companion object {
        const val KEY_INTENT_USER = "user"
    }
}