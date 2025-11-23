package com.example.tutorial_07_fragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val homeFragment = HomeFragment()
    private val settingsFragment = SettingsFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val button2:Button = findViewById(R.id.button2)

        button.setOnClickListener {
            loadHome()
        }
        button2.setOnClickListener {
            loadSettings()
        }
    }


//    lets create 2 function to invoke when buttons got clicked. These functions are private. Why?
//    Those are not available for the outside of this class. These only could be called within the class. So we must declare them private.

    private fun loadHome(){
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        if (fragment == null){ // at the beginning it is null
            supportFragmentManager.beginTransaction().add(R.id.fragmentContainer,homeFragment).commit() // adding a new fragment into the layout
        }else{
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,homeFragment).commit() // here we call replace() method
        }
    }


    private fun loadSettings(){
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer)
        if (fragment == null){
            supportFragmentManager.beginTransaction().add(R.id.fragmentContainer,settingsFragment).commit()
        }else{
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,settingsFragment).commit()
        }
    }
}