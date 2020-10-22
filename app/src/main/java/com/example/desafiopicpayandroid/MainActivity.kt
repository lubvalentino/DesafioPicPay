package com.example.desafiopicpayandroid

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.text.Editable
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import com.example.desafiopicpayandroid.RegisterCreditCardActivity.Companion.KEY_CREDIT_CARD_NUMBER
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity(), Parcelable {

    //Main(posição1) -> Main2(posição2)

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberCreditCard = intent.getStringExtra(KEY_CREDIT_CARD_NUMBER)
//        val professor = intent.getParcelableExtra<Professor>(KEY_TEACHER)
//        val double = intent.getDoubleExtra("double", 0.0)

//        val bundle = intent.extras
//        bundle?.getDouble("double")
//        bundle?.getFloat("float")

//        professor?.nome
//        professor?.sobrenome
//        professor?.matricula

        etCreditCardNumber.text = Editable.Factory.getInstance().newEditable(numberCreditCard)

        initComponents()
    }

    private fun initComponents() {
        etCreditCardNumber.addTextChangedListener(
            MaskWatcher(
                etCreditCardNumber,
                getString(R.string.credit_card_mask)
            )
        )
        etCreditCardExpiration.addTextChangedListener(
            MaskWatcher(
                etCreditCardExpiration,
                getString(R.string.expiration_mask)
            )
        )
        etCreditCardCvv.addTextChangedListener(
            MaskWatcher(
                etCreditCardCvv,
                getString(R.string.cvv_mask)
            )
        )

        etCreditCardNumber.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btCreditCardSave.setOnClickListener {
            startMain2(this@MainActivity)
        }

        ivCreditcardBack.setOnClickListener {
            finish()
        }
    }

    fun startMain2(context: Context) {
        val intent = Intent(context, MainActivity2::class.java)
        startActivity(intent)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}
