package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_passengers.*

class PassengersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passengers)
        setupViews()
    }

    private fun setupViews(){
        val place = intent.getIntExtra("place", 0)
        your_place.text = place.toString()
        btn_dalee.setOnClickListener {

            val fio = full_name.text.toString()
            val phoneNum = user_phone_number.text.toString()
            val email = user_email.text.toString()
            val iin = user_iin.text.toString()

            val intent = Intent(this, PaymentActivity::class.java)
            intent.putExtra("fio", fio)
            intent.putExtra("mesto",place)
            startActivity(intent)
        }

    }
}