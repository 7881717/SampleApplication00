package com.example.sampleapplication00

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vButton0 = findViewById<View>(R.id.button0) as Button
        vButton0.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                R.string.tButton0,
                Toast.LENGTH_LONG
            ).show()

            val intent = Intent(this, LoggedActivity::class.java)
            startActivity(intent)
        }

        val vlink0 = findViewById<View>(R.id.tv_link_forgot_password) as TextView
        vlink0.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                R.string.tLink0,
                Toast.LENGTH_LONG
            ).show()

            val intent = Intent(this, RestoreActivity::class.java)
            startActivity(intent)
        }

        val vlink1 = findViewById<View>(R.id.tv_link_sign_up) as TextView
        vlink1.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                R.string.tLink1,
                Toast.LENGTH_LONG
            ).show()

            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }

    // Метод обработки нажатия на кнопку
//    fun userRegister(view: View?) {
        // действия, совершаемые после нажатия на кнопку
        // Создаем объект Intent для вызова новой Activity
//        val intent = Intent(this, RegisterActivity::class.java)
        // Получаем текстовое поле в текущей Activity
//        val tvEmailEdit = findViewById<View>(R.id.tv_email_edit) as EditText
        // Получае текст данного текстового поля
//        val message = tvEmailEdit.text.toString()
        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        // второй параметр - значение этого объекта
//        intent.putExtra("message", message)
        // запуск activity
//        startActivity(intent)
//    }


}