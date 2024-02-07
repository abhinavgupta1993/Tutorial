package com.abhinav.tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class FirstActivity : AppCompatActivity() {

    lateinit var myBt : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        myBt = findViewById(R.id.myBt)

        myBt.setOnClickListener {
            startActivity(Intent(this@FirstActivity, SecondActivity::class.java))
        }

        Log.e("FIRST_ACTIVITY", "msg : onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.e("FIRST_ACTIVITY", "msg : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("FIRST_ACTIVITY", "msg : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("FIRST_ACTIVITY", "msg : onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("FIRST_ACTIVITY", "msg : onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.e("FIRST_ACTIVITY", "msg : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("FIRST_ACTIVITY", "msg : onDestroy")
    }

}