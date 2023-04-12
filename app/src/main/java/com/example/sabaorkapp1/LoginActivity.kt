package com.example.sabaorkapp1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val myButton: Button = findViewById(R.id.appCompatButton)

        myButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@LoginActivity, ProfileActivity::class.java)
                startActivity(intent)
            }
        })

        val skipTextViewMain: TextView = findViewById(R.id.skipNowButtonLogin)

        skipTextViewMain.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@LoginActivity, ProfileActivity::class.java)
                startActivity(intent)
            }
        })

    }
}