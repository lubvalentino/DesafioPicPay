package com.example.desafiopicpayandroid.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desafiopicpayandroid.R
import kotlinx.android.synthetic.main.activity_register_credit_card.*

class RegisterCreditCardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_credit_card)

        initComponents()
    }

    //object - activity 1 (serializar)->(deserializar) object - activity

    private fun initComponents() {

        btRegisterCreditCard.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(KEY_CREDIT_CARD_NUMBER, "1111222233334444")

            val bundle = Bundle()
            bundle.putDouble("double", 2.2)
            bundle.putFloat("float", 2.2f)

            intent.putExtra("bundle", bundle)
            startActivity(intent)
        }

        ibRegisterCreditCardBack.setOnClickListener {
            finish()
        }
    }

    companion object {
        const val KEY_CREDIT_CARD_NUMBER = "number_credit_card"
    }
}