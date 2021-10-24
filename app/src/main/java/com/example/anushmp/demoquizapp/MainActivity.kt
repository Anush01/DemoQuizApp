package com.example.anushmp.demoquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    lateinit var startbutton: MaterialButton
    lateinit var adminbutton: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startbutton = findViewById(R.id.startbutton)
        adminbutton = findViewById(R.id.adminbutton)


        startbutton.setOnClickListener {

            var i = Intent(this, demoquizactivity::class.java)

            startActivity(i)


        }


        adminbutton.setOnClickListener {

            var i = Intent(this,AdminActivity::class.java)

        }

    }
}