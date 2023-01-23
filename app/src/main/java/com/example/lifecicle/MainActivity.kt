package com.example.lifecicle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("LifeCicle","Oncreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Lifecycle","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LifeCycle","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("LifeCicle","OnPause")
    }

    //cuando nuestra actividad ya no vaya a ejecutarse y debas
    //liberar recursos
    override fun onStop() {
        super.onStop()
        Log.i("LifeCycle","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("LifeCycle","OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Lifecicle","OnDestroy")
    }
}