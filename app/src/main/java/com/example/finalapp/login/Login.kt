package com.example.finalapp.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.finalapp.R
import com.example.finalapp.actividades.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button3.setOnClickListener {
            val next: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(next)
        }
    }
}