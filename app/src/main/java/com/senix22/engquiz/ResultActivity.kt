package com.senix22.engquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra("correctAnsw", 0)

        tv_score.setText( "Your Score is $correctAnswers out of $totalQuestions.")

        if(correctAnswers<=10){
            recomendText.setText("ваш уровень Upper-Intermediate. Сначала закрепите полученные знания.")
        }else if(correctAnswers > 10 || correctAnswers <= 18){
            recomendText.setText("ваш уровень Advanced. Добро пожаловать в мир живого английского!")
        }

        else if( correctAnswers >= 19){
            recomendText.setText(" возможно, ваш уровень знаний выше, но для уровня Proficiency")
        }

        btn_finish.setOnClickListener {
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }

    }
}