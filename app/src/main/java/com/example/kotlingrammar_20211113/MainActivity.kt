package com.example.kotlingrammar_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVaiable.setOnClickListener {
            // 변수 문법 연습 01
            var myName : String
            myName = "김창배"

            Log.d("문법연습01","내 이름은 " + myName)
            Toast.makeText(this, "내 이름은 " + myName, Toast.LENGTH_SHORT).show()

            val friendName : String
            friendName = "김갑생"
            Log.d("문법연습01","친구 이름은 " + friendName)
        }

        btnVaiable2.setOnClickListener {
            // 변수 연습 02
            var myName = "김창배"
            val myBirthYear = 1993
            val myHeight = 173.2

            Log.d("변수연습02", myName)
        }

        btnCondition1.setOnClickListener {
            // 조건문 01 버튼 눌리면 실행될 코드

            val userAge = 20

            // 나이가 20살 이상인가? -> 로그로 "성인입니다." 문장 출력
            if(userAge >= 21) {
                Log.d("조건문 연습 01" , "성인 입니다.")
            } else if(userAge == 20) {
                Log.d("조건문 연습 01" , "이제 갓 20살 애기 입니다.")
            }else {
                Log.d("조건문 연습 01" , "미성년자 입니다.")
            }
        }

        btnCondition2.setOnClickListener {
            // 논리 연산자 체험

            val companyASalary = 3000
            val companyADistance = 50
            val companyAOffEarly = true

            // 1번 구직자 (조건 : 연봉4천이상)
            val person01OK = companyASalary >= 4000
            Log.d("조건문 연습 02",person01OK.toString())

            // 2번 구직자 (조건 : 이동시간 30분이내 or 빨리 퇴근)
            val person02OK = (companyADistance <= 30) || companyAOffEarly
            Log.d("조건문 연습 02",person02OK.toString())

            // 3번 구직자 (조건 : 빨리퇴근)
            val person03OK = !companyAOffEarly
            Log.d("조건문 연습 02",person03OK.toString())
       }
    }
}