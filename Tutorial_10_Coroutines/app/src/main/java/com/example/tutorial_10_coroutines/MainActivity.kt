package com.example.tutorial_10_coroutines

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

//      since suspend functions can not be called within the normal scope we put it inside this
        CoroutineScope(Dispatchers.Main).launch {
            counter(textView)
        }


        button.setOnClickListener {
            // we can use coroutines to block the thread also
            // sometimes some processes must complete before we go to the next step.to that, we can use runBlocking to block the existing thread
            runBlocking {
                delay(3000)
            }
            Toast.makeText(this, "This is a button click", Toast.LENGTH_LONG).show()
        }
    }

    private suspend fun counter(view: TextView){
        var x= 0

        //a never ending while loop
        while(true){
            view.text = x.toString()
//            suspend keyword ek dpu nisai me delay() method ek danna plwn. but suspend functions should be called only from a coroutine. We cant directly call inside the onCreate()
            delay(1000)
            x++
        }
    }
}