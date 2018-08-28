package com.egco427.lab2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val bundle = intent.extras
        val input1 : Int

        if (bundle != null){
            input1 = bundle.getInt("input2")
            textView3.text =input1.toString()
            /*reText.setText(input1)*/
        }
    }
}
