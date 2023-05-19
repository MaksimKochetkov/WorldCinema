package ru.aleksandr.au_worldcinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
    }


    fun logback(view: View) {
        val intent_logback = Intent(this@MainActivity4, MainActivity2::class.java)
        startActivity(intent_logback)
    }
}