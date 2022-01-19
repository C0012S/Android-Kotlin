package com.malo.android.lotto

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*

class MainActivity : AppCompatActivity() {
    val random = Random() // 랜덤 값을 사용할 수 있도록 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<Button>(R.id.lottoNum1)
        val num2 = findViewById<Button>(R.id.lottoNum2)
        val num3 = findViewById<Button>(R.id.lottoNum3)
        val num4 = findViewById<Button>(R.id.lottoNum4)
        val num5 = findViewById<Button>(R.id.lottoNum5)
        val num6 = findViewById<Button>(R.id.lottoNum6)

        findViewById<FloatingActionButton>(R.id.runButton).setOnClickListener {
            Log.d("로또 앱", "버튼 누름")

            setLottoNum(num1)
            setLottoNum(num2)
            setLottoNum(num3)
            setLottoNum(num4)
            setLottoNum(num5)
            setLottoNum(num6)
        }
    }

    fun setLottoNum(lottoNum: Button) {
        lottoNum.text = "${random.nextInt(45) + 1}"
        lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(86, 88, 88))
    }
}