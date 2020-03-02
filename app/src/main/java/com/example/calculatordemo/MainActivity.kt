/**
 * Simple Calculator app developed using Kotlin
 * @author : Anand Raina
 * @version : 1.0
 * @since : 1.0
 * */


package com.example.calculatordemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // TODO : Add variables and helper methods below
    var numValue : String = ""
    var num : Double = 0.0
    var temp : Double = 0.0

    private fun insertNum(numValue : String){
        if(editText.text.toString().equals("0")) {
            editText.setText(numValue)
        } else {
            editText.setText(editText.text.toString() + numValue)
        }
    }

    // TODO : Add activity specific tasks below
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO : Add code below
        button_clear.setOnClickListener {
            editText.setText("0")
        }
        button_add.setOnClickListener{
            num = editText.text.toString().toDouble()
            editText.setText(editText.text.toString() + " + ")

        }
        button_subtract.setOnClickListener{
            num = editText.text.toString().toDouble()
            editText.setText(editText.text.toString() + " - ")
        }
        button_multiply.setOnClickListener{
            num = editText.text.toString().toDouble()
            editText.setText(editText.text.toString() + " * ")
        }
        button_divide.setOnClickListener{
            num = editText.text.toString().toDouble()
            editText.setText(editText.text.toString() + " / ")
        }
        button_result.setOnClickListener{
            var num2 : String = editText.text.toString()
            var tempString : String = ""
            var calcOperator : String = ""
            var i : Int = num2.length - 1
            while(i>=0) {
                if(num2[i].equals(' ')) {
                    calcOperator = num2[i-1].toString()
                    break
                } else {
                    tempString = num2[i] + tempString
                    i--
                }
            }
            temp = tempString.toDouble()
            if(calcOperator.equals("+")) {
                num = num + temp
            } else if(calcOperator.equals("-")) {
                num = num - temp
            } else if(calcOperator.equals("*")) {
                num = num * temp
            } else if(calcOperator.equals("/")) {
                num = num / temp
            }
            var finalResult : String = num.toString()
            editText.setText(finalResult)
        }

        button1.setOnClickListener {
            numValue = "1"
            insertNum(numValue)
        }
        button2.setOnClickListener {
            numValue = "2"
            insertNum(numValue)
        }
        button3.setOnClickListener {
            numValue = "3"
            insertNum(numValue)
        }
        button4.setOnClickListener {
            numValue = "4"
            insertNum(numValue)
        }
        button5.setOnClickListener {
            numValue = "5"
            insertNum(numValue)
        }
        button6.setOnClickListener {
            numValue = "6"
            insertNum(numValue)
        }
        button7.setOnClickListener {
            numValue = "7"
            insertNum(numValue)
        }
        button8.setOnClickListener {
            numValue = "8"
            insertNum(numValue)
        }
        button9.setOnClickListener {
            numValue = "9"
            insertNum(numValue)
        }
        button0.setOnClickListener {
            numValue = "0"
            insertNum(numValue)
        }
    }
}
