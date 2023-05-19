package ru.aleksandr.au_worldcinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }


    fun logback(view: View) {
        val intent_regis = Intent(this@MainActivity3, MainActivity4::class.java)
        startActivity(intent_regis)
    }
    fun reg(view: View) {
        val intent_logback = Intent(this@MainActivity3, MainActivity2::class.java)
        startActivity(intent_logback)
    }
}