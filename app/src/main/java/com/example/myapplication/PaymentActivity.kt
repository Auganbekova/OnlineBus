package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        setupViews()
    }
    private fun setupViews(){

        val paymentSuccesfull = AlertDialog.Builder(this)
        paymentSuccesfull.setTitle("Оплачено!")
        paymentSuccesfull.setMessage("Чтобы посмотреть покупку переходите в история заказов.")


        btn_payment.setOnClickListener {
            paymentSuccesfull.setPositiveButton("Ok") { dialog, which ->

                val fio = intent.getStringExtra("fio")
                val mesto = intent.getIntExtra("mesto",0)

                val intent = Intent(this, PaymentDetails::class.java)
                intent.putExtra("fio", fio)
                intent.putExtra("mesto", mesto)

                startActivity(intent)

            }
            paymentSuccesfull.show()


        }
    }
}