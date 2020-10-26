package com.senix22.engquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.MainThread
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_start.setOnClickListener{
            if (et_name.text.toString().isEmpty() && et_name.text.toString().equals("")){
                Toast.makeText(this@MainActivity,"Enter ur name!",Toast.LENGTH_LONG).show()
            }else {

                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)


                intent.putExtra(Constants.USER_NAME, et_name.text.toString())

                startActivity(intent)
                finish()
            }
        }

    }
}