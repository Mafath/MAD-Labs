package com.example.tutorial_03

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class exercise2_activity : AppCompatActivity() {

//  In order to do the interactions and get the content inside, create objects from each element
//  since we cant keep variables without assigning values, we put 'lateinit' key word.
//  because of null safety in Kotlin, we can't keep variables null. So if we are going to keep them null we have to say that we'll initialize it later.
    lateinit var edtName: EditText
    lateinit var btnWelcome: Button
    lateinit var btnGoodBye: Button
//    we can assign these only inside the onCreate() method. Bcs when calling the setContentView() only, the view will be available for the process

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.exercise2)  //meken thama UI eka screen ekta load wenne

//      this findViewById() is similar to document.getElementById
        edtName = findViewById(R.id.edtName)
        btnWelcome = findViewById(R.id.btnWelcome)
        btnGoodBye = findViewById(R.id.btnGoodBye)


        btnWelcome.setOnClickListener {
            welcome()
        }

        btnGoodBye.setOnClickListener {
            goodBye()
        }
    }


    fun welcome(){
        Toast.makeText(this, "${getText(R.string.msg1)} ${edtName.text.toString()}", Toast.LENGTH_LONG).show()
    }

    fun goodBye(){
        Toast.makeText(this, "${getText(R.string.msg2)} ${edtName.text.toString()}", Toast.LENGTH_LONG).show()
    }

}