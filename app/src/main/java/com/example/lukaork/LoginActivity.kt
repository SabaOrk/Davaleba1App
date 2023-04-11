package com.example.lukaork

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.lukaork.R.layout.activity_login)

        val myButton: Button = findViewById(com.example.lukaork.R.id.appCompatButton)

        myButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@LoginActivity, ProfileActivity::class.java)
                startActivity(intent)
            }
        })

    }
}