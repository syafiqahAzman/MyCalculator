package webservices.rp.edu.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var numb = ""
    private var operator =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





    }

    fun btnOnClick(view: View){

        val btnSelected = view as Button

        when(btnSelected.id){
            btn0.id -> numb += "0"
            btn1.id -> numb += "1"
            btn2.id -> numb += "2"
            btn3.id -> numb += "3"
            btn4.id -> numb += "4"
            btn5.id -> numb += "5"
            btn6.id -> numb += "6"
            btn7.id -> numb += "7"
            btn8.id -> numb += "8"
            btn9.id -> numb += "9"

        }
        tvCal.text = numb
    }

    fun btnOnClickMath(view: View){

        val btnSelected = view as Button

        when(btnSelected.id){
            btnPlus.id -> operator = "+"
            btnSlash.id -> operator = "/"
            btnMinus.id -> operator = "-"
            btnStar.id -> operator = "*"

        }

    }
    fun btnOnClickResult(view: View){

        val result = numb.toDouble()
    }
    fun btnOnClickClear(view: View){
        tvCal.text = ""
    }
}
