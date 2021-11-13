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
    }
}