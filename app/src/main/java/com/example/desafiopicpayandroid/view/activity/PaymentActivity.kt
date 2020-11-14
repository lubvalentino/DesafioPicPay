package com.example.desafiopicpayandroid.view.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.desafiopicpayandroid.PaymentFragment
import com.example.desafiopicpayandroid.R
import com.example.desafiopicpayandroid.viewModel.PaymentViewModel
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity : AppCompatActivity() {

    private lateinit var viewModel: PaymentViewModel

    //PaymentViewModel

    //paymentActivity

    //paymentFragment1

    //paymentFragment2

    //paymentFragment3


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        viewModel = ViewModelProvider(this).get(PaymentViewModel::class.java)

        viewModel.onTextChange.observe(this, { color ->
            color?.let {
                tvTest.setTextColor(Color.parseColor(color))
            }
        })

        Log.i("teste - ACTIVITY", "onCreate")

        Toast.makeText(this, "Cliquei no botão", Toast.LENGTH_SHORT).show()

        btBottomSheet.setOnClickListener {
            val bottomSheet = PaymentFragment()
            val bundle = Bundle()
            bundle.putString("testeString", "xpto")
            bundle.putDouble("testeDouble", 1.0)
            bundle.putFloat("testeFloat", 1.0f)
            bundle.putInt("testeInt", 1)
            bottomSheet.arguments = bundle
            bottomSheet.show(supportFragmentManager, bottomSheet.tag)
        }
    }

    override fun onStart() {
        super.onStart()

        Log.i("teste - ACTIVITY", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("teste - ACTIVITY", "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.i("teste - ACTIVITY", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.i("teste - ACTIVITY", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("teste - ACTIVITY", "onDestroy")
    }
}