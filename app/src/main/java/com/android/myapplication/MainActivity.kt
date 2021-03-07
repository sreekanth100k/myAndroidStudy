package com.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/*
 * Just putting logs in different call back methods.
 */

//Starting the mobile.
/**
 * On starting
 * onCreate()
 * onStart()
 * onResume()
 */

//Rotating the mobile.
/**
 * onPause()
 * onStop()
 * onDestroy()
 * onCreate()
 * onStart()
 * onResume()
 */
//Minimized app..
/**
 * onPause()
 * onStop()
 * onRestart()
 * onStart()
 * onResume()
 */
//Call arrives..
/*onPause()
onStop()
on cutting the call...
onRestart()
onStart()
onResume()
 */





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("LifeCycleCallBack","onCreate()")

    }

    override fun onStart() {
        super.onStart()

        Log.d("LifeCycleCallBack","onStart()")

    }
    override fun onPause() {
        super.onPause()

        Log.d("LifeCycleCallBack","onPause()")

    }

    override fun onResume() {
        super.onResume()

        Log.d("LifeCycleCallBack","onResume()")

    }

    override fun onRestart() {
        super.onRestart()

        Log.d("LifeCycleCallBack","onRestart()")

    }

    override fun onStop() {
        super.onStop()

        Log.d("LifeCycleCallBack","onStop()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("LifeCycleCallBack","onDestroy()")

    }
}