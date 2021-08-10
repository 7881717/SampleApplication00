package com.example.sampleapplication00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent


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

        tvView!!.text = "Your e-mail is: $fName \nYour password is:  $lName"

/**
        val textView = TextView(this)
        textView.textSize = 26f


        val arguments = intent.extras

        if (arguments != null) {
            val userName = arguments["Username"].toString()
            val userPassword = arguments.getString("Userpassword")
            textView.text = """
                Name: $userName
                Pwd: $userPassword
                """.trimIndent()
        }


        setContentView(textView)
*/

    }
}