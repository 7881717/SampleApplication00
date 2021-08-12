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

        val fName = intent.getStringExtra("Username")
        val lName = intent.getStringExtra("Userpassword")


        val preName = fName?.substringBefore("@")

        val first = preName?.substringBefore('.')?.capitalize()

        val preLast = preName?.substringAfter('.')

        val last = preLast?.substringBefore('.')?.capitalize()


        tvView!!.text = "$first $last"

    }
}