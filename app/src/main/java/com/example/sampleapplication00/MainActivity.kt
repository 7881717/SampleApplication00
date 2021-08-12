package com.example.sampleapplication00

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


import android.widget.EditText


class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



/**
        val userName = "ladislaw.pszczelarz"
        val userPassword = "q"


        val intent = Intent(this, LoggedActivity::class.java)

        intent.putExtra("Username", userName)
        intent.putExtra("Userpassword", userPassword)

        startActivity(intent)

*/

        val vButton0 = findViewById<View>(R.id.button0) as Button
        vButton0.setOnClickListener {

            var emailCorrect = false
            var passwordCorrect = false

            val emailValidate = findViewById<View>(R.id.tv_email_edit) as EditText

            val textView = findViewById<View>(R.id.tv_email_verify) as TextView

            val email = emailValidate.text.toString().trim { it <= ' ' }


            val emailRegex = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
            fun isEmailValid(email: String): Boolean {
                return emailRegex.toRegex().matches(email)
            }

            if (isEmailValid(email)) {
                emailCorrect = true
                textView.text = " "
            } else {
                textView.text = getString(R.string.invalid_email)
            }



            val passwordValidate = findViewById<View>(R.id.tv_password_edit) as EditText

            val textView1 = findViewById<View>(R.id.tv_password_verify) as TextView

            val password = passwordValidate.text.toString()

            if (password.length > 7) {
                textView1.text = " "
                passwordCorrect = true
            } else {
                textView1.text = getString(R.string.invalid_password)
            }


            val nameText = findViewById<EditText>(R.id.tv_email_edit)
            val pwdText = findViewById<EditText>(R.id.tv_password_edit)


            val userName = nameText.text.toString()
            val userPassword = pwdText.text.toString()


            val intent = Intent(this, LoggedActivity::class.java)

            intent.putExtra("Username", userName)
            intent.putExtra("Userpassword", userPassword)

            if (emailCorrect && passwordCorrect) startActivity(intent)
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

            val intent = Intent(this, AuthActivity::class.java)
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