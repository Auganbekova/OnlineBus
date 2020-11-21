package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        setupViews()
    }
    private fun setupViews(){
        btn_payment.setOnClickListener {
            val fio = intent.getStringExtra("fio")
            val mesto = intent.getIntExtra("mesto",0)

            val intent = Intent(this, PaymentDetails::class.java)
            intent.putExtra("fio", fio)
            intent.putExtra("mesto", mesto)

            startActivity(intent)

        }
    }
}