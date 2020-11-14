package com.example.desafiopicpayandroid.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.desafiopicpayandroid.R
import com.example.desafiopicpayandroid.model.User
import com.example.desafiopicpayandroid.view.activity.HomeActivity.Companion.KEY_INTENT_USER
import kotlinx.android.synthetic.main.activity_user_payment.*

class UserPaymentActivity : AppCompatActivity() {

    private var user: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_payment)

        user = intent.getParcelableExtra(KEY_INTENT_USER)

        setupUser()
    }

    private fun setupUser() {
        Glide.with(this).load(user?.userProfileAvatar).into(ivUserPaymentAvatar)
        tvUserPaymentUserId.text = user?.userId
    }
}