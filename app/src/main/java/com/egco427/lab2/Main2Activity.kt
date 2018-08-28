package com.egco427.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        val input1 : String

        if (bundle != null){
            input1 = bundle.getString("input1")
            textView2.text =input1
            /*reText.setText(input1)*/

        }

        var sum1: Int
        button2.setOnClickListener{
            sum1 = textView2.text.toString().toInt()+editText2.text.toString().toInt()
            textView2.text =sum1.toString()
            val intent2 = Intent(this, Main3Activity::class.java)
            intent2.putExtra("input2",sum1)
            startActivity(intent2)
        }
    }
}
