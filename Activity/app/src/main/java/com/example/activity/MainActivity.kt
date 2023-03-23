package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mes = intent.getStringExtra("mes")
        val tv_aa: TextView = findViewById <TextView>(R.id.tv_aa)
        tv_aa.setText(mes)
    }
}