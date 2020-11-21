package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_payment_details.*
import java.text.SimpleDateFormat
import java.util.*

import kotlin.math.log

class PaymentDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_details)
        setupViews()
    }
    private fun setupViews(){

        val datef = SimpleDateFormat("dd/M/yyyy")
        val timef = SimpleDateFormat("hh:mm")
        val currentDate = datef.format(Date())
        val currentTime = timef.format(Date())

        Log.d("date_check", currentDate)
        Log.d("date_check", currentTime)
        val fio = intent.getStringExtra("fio")
        val mesto = intent.getIntExtra("mesto",0)
        name_passenger.text = fio
        mesto_det.text = mesto.toString()
        date.text = currentDate
        time_order.text = currentTime
    }
}