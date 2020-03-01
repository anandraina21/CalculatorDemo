/**
 * @author : Anand Raina
 * */


package com.example.calculatordemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num1 : Double = 0.0
    var num2 : Double = 0.0

    private fun checkIllegalValues() {
        if (editText_enter_number_1.text.toString().equals(null) || editText_enter_number_1.text.toString().equals("")
            || editText_enter_number_1.text.toString().equals(".")
        ) {
            editText_enter_number_1.setText("0")
        }

        if (editText_enter_number_2.text.toString().equals(null) || editText_enter_number_2.text.toString().equals("")
            || editText_enter_number_2.text.toString().equals(".")
        ) {
            editText_enter_number_2.setText("0")
        }
    }
    
    private fun setValues() {
        num1 = editText_enter_number_1.text.toString().toDouble()
        num2 = editText_enter_number_2.text.toString().toDouble()
    }
    
    private fun showResult(result: Double) {
        var output: String = result.toString()
        editText_show_result.setText(output)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_clear.setOnClickListener {
            editText_enter_number_1.setText("0")
            editText_enter_number_2.setText("0")
            editText_show_result.setText("")
        }

        button_add.setOnClickListener {
            checkIllegalValues()
            setValues()
            var result: Double = num1 + num2
            showResult(result)
        }

        button_subtract.setOnClickListener {
            checkIllegalValues()
            setValues()
            var result: Double = num1 - num2
            showResult(result)
        }

        button_multiply.setOnClickListener {
            checkIllegalValues()
            setValues()
            var result: Double = num1 * num2
            showResult(result)
        }

        button_divide.setOnClickListener {
            checkIllegalValues()
            setValues()
            var result: Double = num1 / num2
            showResult(result)
        }
    }
}
