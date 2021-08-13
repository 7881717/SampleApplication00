package com.example.sampleapplication00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


import android.view.View

var tvView: TextView? = null
class LoggedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)


         tvView = findViewById<View>(R.id.tv_log1) as TextView

        val intent = intent

        // data from previous activity
        val fName = intent.getStringExtra("Username")
        val lName = intent.getStringExtra("Userpassword")

        // first name parser
        val preName = fName?.substringBefore("@")
        val first = preName?.substringBefore('.')?.capitalize()

        // second name parser
        val preLast = preName?.substringAfter('.')
        val last = preLast?.substringBefore('.')?.capitalize()

        // show parsed names
        tvView!!.text = "$first $last"

    }
}