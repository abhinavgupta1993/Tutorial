package com.abhinav.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.e("SECOND_ACTIVITY", "msg : onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.e("SECOND_ACTIVITY", "msg : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("SECOND_ACTIVITY", "msg : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("SECOND_ACTIVITY", "msg : onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("SECOND_ACTIVITY", "msg : onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.e("SECOND_ACTIVITY", "msg : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("SECOND_ACTIVITY", "msg : onDestroy")
    }
    
}