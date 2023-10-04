package com.example.projectbp2689

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //instance
        val btnBookKid:Button = findViewById(R.id.buttonMenu1)
        //event btn book kid di-klik

        btnBookKid.setOnClickListener {
            val intentBookKid = Intent(this,BookKidActivity::class.java)
            startActivity(intentBookKid)
        }
    }
}