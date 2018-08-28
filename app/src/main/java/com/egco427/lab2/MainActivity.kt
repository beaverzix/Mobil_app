package com.egco427.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("input1",editText.text.toString())
            startActivity(intent)
        }
    }
    fun backToMain(view: View){
        finish()
    }
}
