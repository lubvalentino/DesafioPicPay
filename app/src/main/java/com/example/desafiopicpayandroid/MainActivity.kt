package com.example.desafiopicpayandroid

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Aula 16", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Aula 16", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Aula 16", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Aula 16", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Aula 16", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Aula 16", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Aula 16", "onDestroy")
    }

}