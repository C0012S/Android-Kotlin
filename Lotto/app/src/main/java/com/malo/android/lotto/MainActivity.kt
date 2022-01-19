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
    private val random = Random() // 랜덤 값을 사용할 수 있도록 선언
    private val numbers = arrayListOf<Int>() // 번호를 저장할 배열 생성

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

            numbers.clear()

            setLottoNum(num1)
            setLottoNum(num2)
            setLottoNum(num3)
            setLottoNum(num4)
            setLottoNum(num5)
            setLottoNum(num6)
        }
    }

    private fun setLottoNum(lottoNum: Button) {
        var num = 0
        while(true) { // 중복되지 않도록 num에 임의의 정수 지정
            num = random.nextInt(45) + 1
            if (!numbers.contains(num)) {
                numbers.add(num)
                break
            }
        }

        lottoNum.text = "${num}"

        if (num <= 10) { // 1~10 : 노란색
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(255, 255, 0))
        }
        else if (num <= 20) { // 11~20 : 파란색
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(0, 0, 255))
        }
        else if (num <= 30) { // 21~30 : 빨간색
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(255, 0, 0))
        }
        else if (num <= 40) { // 31~40 : 회색
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(86, 88, 88))
        }
        else { // 41~45 : 초록색
            lottoNum.backgroundTintList = ColorStateList.valueOf(Color.rgb(0, 255, 0))
        }
    }
}