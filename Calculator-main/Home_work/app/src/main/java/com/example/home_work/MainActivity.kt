package com.example.home_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num = 0
    var nu = 0
    var cost = 0
    var ch = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number = 0
        button21.setOnClickListener {
            if (textView.text.toString() == "0") {
                textView.setText("0.")
            } else {
                var nn = textView.text.toString().plus(".")
                textView.setText(nn)
            }
        }
        button6.setOnClickListener {
            if (textView.text.toString() == "0" || nu == 1) {
                textView.setText("8")
                nu = 0
            } else {
                var n8 = textView.text.toString().plus(8)
                textView.setText(n8)
            }
        }

        button5.setOnClickListener {
            if (textView.text.toString() == "0" || nu == 1) {
                textView.setText("7")
                nu = 0
            } else {
                var n7 = textView.text.toString().plus(7)
                textView.setText(n7)
            }
        }
        button8.setOnClickListener {
            if (textView.text.toString() == "0" || nu == 1) {
                textView.setText("9")
                nu = 0
            } else {
                var n9 = textView.text.toString().plus(9)
                textView.setText(n9)
            }
        }
        button9.setOnClickListener {
            if (textView.text.toString() == "0" || nu == 1) {
                textView.setText("4")
                nu = 0
            } else {
                var n4 = textView.text.toString().plus(4)
                textView.setText(n4)
            }

        }
        button10.setOnClickListener {
            if (textView.text.toString() == "0" || nu == 1) {
                textView.setText("5")
                nu = 0
            } else {
                var n5 = textView.text.toString().plus(5)
                textView.setText(n5)
            }

        }
        button11.setOnClickListener {
            if (textView.text.toString() == "0" || nu == 1) {
                textView.setText("6")
                nu = 0
            } else {
                var n6 = textView.text.toString().plus(6)
                textView.setText(n6)
            }
        }
        button13.setOnClickListener {
            if (textView.text.toString() == "0" || nu == 1) {
                textView.setText("1")
                nu = 0
            } else {
                var n1 = textView.text.toString().plus(1)
                textView.setText(n1)
            }
        }
        button14.setOnClickListener {
            if (textView.text.toString() == "0" || nu == 1) {
                textView.setText("2")
                nu = 0
            } else {
                var n2 = textView.text.toString().plus(2)
                textView.setText(n2)
            }
        }
        button15.setOnClickListener {
            if (textView.text.toString() == "0" || nu == 1) {
                textView.setText("3")
                nu = 0
            } else {
                var n3 = textView.text.toString().plus(3)
                textView.setText(n3)
            }
        }
        button20.setOnClickListener {
            if (textView.text.toString() == "0" || nu == 1) {
                textView.setText("0")
                nu = 0
            } else {
                var n0 = textView.text.toString().plus(0)
                textView.setText(n0)
            }
        }
        button.setOnClickListener {
            if (textView.text.toString() >= "0") {
                textView.setText("0")
            }
        }
        button2.setOnClickListener {
            if (textView.text.toString().length <= 1) {
                textView.setText("0")
            } else {
                textView.text = textView.text.dropLast(1)
            }
        }


        button16.setOnClickListener {
            nu = 1
            num = textView.text.toString().toInt()
            ch = "bu"
        }

        button12.setOnClickListener {
            nu = 1
            num = textView.text.toString().toInt()
            ch = "de"
        }

        button7.setOnClickListener {
            nu = 1
            num = textView.text.toString().toInt()
            ch = "ku"
        }

        button4.setOnClickListener {
            nu = 1
            num = textView.text.toString().toInt()
            ch = "hr"
        }
            button23.setOnClickListener {
                if (ch == "de") {
                    cost = num - textView.text.toString().toInt()
                    textView.text = cost.toString()
                } else if (ch == "bu") {
                    cost = num + textView.text.toString().toInt()
                    textView.text = cost.toString()
                } else if (ch == "ku") {
                    cost = num * textView.text.toString().toInt()
                    textView.text = cost.toString()
                } else if (ch == "hr") {
                    cost = num / textView.text.toString().toInt()
                    textView.text = cost.toString()
                }


        }
    }
}










