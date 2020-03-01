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
            editText_enter_number_1.setText("0")
            editText_enter_number_2.setText("0")
            editText_show_result.setText("")
        }

        button_add.setOnClickListener {
            if (editText_enter_number_1.text.toString().equals(null) || editText_enter_number_1.text.toString().equals(
                    ""
                ) || editText_enter_number_1.text.toString().equals(".")
            ) {
                editText_enter_number_1.setText("0")
            }

            if (editText_enter_number_2.text.toString().equals(null) || editText_enter_number_2.text.toString().equals(
                    ""
                ) || editText_enter_number_2.text.toString().equals(".")
            ) {
                editText_enter_number_2.setText("0")
            }

            var num1: Double = editText_enter_number_1.text.toString().toDouble()
            var num2: Double = editText_enter_number_2.text.toString().toDouble()
            var result: Double = num1 + num2
            var output: String = result.toString()
            editText_show_result.setText(output)
        }

        button_subtract.setOnClickListener {
            if (editText_enter_number_1.text.toString().equals(null) || editText_enter_number_1.text.toString().equals(
                    ""
                ) || editText_enter_number_1.text.toString().equals(".")
            ) {
                editText_enter_number_1.setText("0")
            }

            if (editText_enter_number_2.text.toString().equals(null) || editText_enter_number_2.text.toString().equals(
                    ""
                ) || editText_enter_number_2.text.toString().equals(".")
            ) {
                editText_enter_number_2.setText("0")
            }

            var num1: Double = editText_enter_number_1.text.toString().toDouble()
            var num2: Double = editText_enter_number_2.text.toString().toDouble()
            var result: Double = num1 - num2
            var output: String = result.toString()
            editText_show_result.setText(output)
        }

        button_multiply.setOnClickListener {
            if (editText_enter_number_1.text.toString().equals(null) || editText_enter_number_1.text.toString().equals(
                    ""
                ) || editText_enter_number_1.text.toString().equals(".")
            ) {
                editText_enter_number_1.setText("0")
            }

            if (editText_enter_number_2.text.toString().equals(null) || editText_enter_number_2.text.toString().equals(
                    ""
                ) || editText_enter_number_2.text.toString().equals(".")
            ) {
                editText_enter_number_2.setText("0")
            }

            var num1: Double = editText_enter_number_1.text.toString().toDouble()
            var num2: Double = editText_enter_number_2.text.toString().toDouble()
            var result: Double = num1 * num2
            var output: String = result.toString()
            editText_show_result.setText(output)
        }

        button_divide.setOnClickListener {
            if (editText_enter_number_1.text.toString().equals(null) || editText_enter_number_1.text.toString().equals(
                    ""
                ) || editText_enter_number_1.text.toString().equals(".")
            ) {
                editText_enter_number_1.setText("0")
            }

            if (editText_enter_number_2.text.toString().equals(null) || editText_enter_number_2.text.toString().equals(
                    ""
                ) || editText_enter_number_2.text.toString().equals(".")
            ) {
                editText_enter_number_2.setText("0")
            }

            var num1: Double = editText_enter_number_1.text.toString().toDouble()
            var num2: Double = editText_enter_number_2.text.toString().toDouble()
            var result: Double = num1 / num2
            var output: String = result.toString()
            editText_show_result.setText(output)
        }
    }
}
