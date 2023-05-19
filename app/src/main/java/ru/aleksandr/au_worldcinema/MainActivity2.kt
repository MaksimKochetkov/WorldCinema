package ru.aleksandr.au_worldcinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }


    fun register(view: View) {
        val intent_reg= Intent(this@MainActivity2, MainActivity3::class.java)
        startActivity(intent_reg)
    }
    fun sighin(view: View) {
        val intent_log= Intent(this@MainActivity2, MainActivity4::class.java)
        startActivity(intent_log)
    }
}