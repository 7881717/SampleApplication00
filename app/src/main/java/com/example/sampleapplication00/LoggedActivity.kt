package com.example.sampleapplication00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoggedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)
    }
}