/**
 * @author : Anand Raina
 * */


package com.example.calculatordemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_clear.setOnClickListener {
            editText_enter_number_1.setText("")
            editText_enter_number_2.setText("")
            editText_show_result.setText("")
        }

        button_add.setOnClickListener {
            var num1: Double = editText_enter_number_1.text.toString().toDouble()
            var num2: Double = editText_enter_number_2.text.toString().toDouble()
            var result: Double = num1 + num2
            var output: String = result.toString()
            editText_show_result.setText(output)
        }

        button_subtract.setOnClickListener {
            var num1: Double = editText_enter_number_1.text.toString().toDouble()
            var num2: Double = editText_enter_number_2.text.toString().toDouble()
            var result: Double = num1 - num2
            var output: String = result.toString()
            editText_show_result.setText(output)
        }

        button_multiply.setOnClickListener {
            var num1: Double = editText_enter_number_1.text.toString().toDouble()
            var num2: Double = editText_enter_number_2.text.toString().toDouble()
            var result: Double = num1 * num2
            var output: String = result.toString()
            editText_show_result.setText(output)
        }

        button_divide.setOnClickListener {
            var num1: Double = editText_enter_number_1.text.toString().toDouble()
            var num2: Double = editText_enter_number_2.text.toString().toDouble()
            var result: Double = num1 / num2
            var output: String = result.toString()
            editText_show_result.setText(output)
        }
    }
}
