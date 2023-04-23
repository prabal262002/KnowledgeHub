package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class secondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        
        val callBtn = findViewById<Button>(R.id.callButton)
        callBtn.setOnClickListener {
            val number = "919264958820"
            val call = Uri.parse("tel:$number")
            intent = Intent(Intent.ACTION_DIAL,call)
            startActivity(intent)
        }
    }
}