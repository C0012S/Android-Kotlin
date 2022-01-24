package com.malo.android.secretmemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editPassword = findViewById<EditText>(R.id.editPassword)

        findViewById<Button>(R.id.button).setOnClickListener {
            val emailText = editEmail.text.toString()
            val passwordText = editPassword.text.toString()

            if (emailText == "aaa@gmail.com") {
                if (passwordText == "12345678") { // 이메일과 비밀번호가 맞을 경우
                    Log.d("Secret Memo", "통과.")
                }
                else { // 이메일이 맞지만 비밀번호가 틀렸을 경우
                    Log.d("Secret Memo", "비밀번호가 틀렸어요.")
                }
            }
            else { // 이메일이 틀렸을 경우
                Log.d("Secret Memo", "이메일이 틀렸어요.")
            }
        }
    }
}