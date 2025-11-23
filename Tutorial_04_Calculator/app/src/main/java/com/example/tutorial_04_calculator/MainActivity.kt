package com.example.tutorial_04_calculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tutorial_04_calculator.Models.Calculator
import android.widget.Toast

class MainActivity : AppCompatActivity() {

//    we changed the ids of elements. Now we'll create objects of those elements
//    so lets create 2 objects which are going to be EditTexts
//    lateinit means we are going to initialize them later. Bcs in Kotlin we cant keep variables without assigning
    lateinit var edtNumber1: EditText
    lateinit var edtNumber2: EditText

// onCreate() is the function, that will get invoked for the first time when we load the activity on the screen
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//    initializing
        edtNumber1 = findViewById(R.id.edittxt1)
        edtNumber2 = findViewById(R.id.edittxt2)
//    everything under the res directory will be compiled into a kotlin class called R. So if we wanna find anything from the res directory
//    (drawables, xml...) we call them by using the R class
    }




//this function wll be invoked whenever user clicks a button. we are passing a special parameter to the function
    fun buttonClick(v: View){ //here we are expecting an object from View class. Everything on the screen considered as a view
//        a variable to contain our answer
        var ans = 0.0
//        creating an object from the Calculator class
        val calculator = Calculator(
            edtNumber1.text.toString().toDouble(),  //get the value of first box. these are parameters for the Calculator() class
            edtNumber2.text.toString().toDouble())  //get the value of second box

//    we use a when statement to check which button has been called
        when(v.id){
            R.id.btn1 -> ans = calculator.add()
            R.id.btn2 -> ans = calculator.subtract()
            R.id.btn3 -> ans = calculator.multiply()
            R.id.btn4 -> ans = calculator.divide()
        }

//      println(ans)//this will print the output on the terminal

//      in android we can use this method to show toast messages. This accepts 3 parameters
        Toast.makeText(this, "Answer = $ans", Toast.LENGTH_LONG).show()
    }

}