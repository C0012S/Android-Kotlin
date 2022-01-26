package com.malo.android.secretmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editPassword = findViewById<EditText>(R.id.editPassword)

        val intent = Intent(this, MemoActivity::class.java)
        val enter_text = findViewById<TextView>(R.id.text)

        findViewById<Button>(R.id.button).setOnClickListener {
            val emailText = editEmail.text.toString()
            val passwordText = editPassword.text.toString()

            if (emailText == "aaa@gmail.com") {
                if (passwordText == "12345678") { // 이메일과 비밀번호가 맞을 경우
                    Log.d("Secret Memo", "통과.")
                    enter_text.text = "이메일과 비밀번호가 맞았어요."
                    startActivity(intent)
                    this.finish()
                }
                else { // 이메일이 맞지만 비밀번호가 틀렸을 경우
                    Log.d("Secret Memo", "비밀번호가 틀렸어요.")
                    enter_text.text = "비밀번호가 틀렸어요. 다시 입력해 주세요."
                }
            }
            else { // 이메일이 틀렸을 경우
                Log.d("Secret Memo", "이메일이 틀렸어요.")
                enter_text.text = "이메일이 틀렸어요."
            }
        }
    }
}