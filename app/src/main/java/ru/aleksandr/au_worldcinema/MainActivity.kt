package ru.aleksandr.au_worldcinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val timer = object:CountDownTimer(3000,500)
    {
        override fun onTick(millisUntilFinished: Long) {
        }
        override fun onFinish() {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
            finish()
            }
        }
        timer.start()
    }
}