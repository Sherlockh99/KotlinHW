package com.sherlock.gb.kotlin.hws.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sherlock.gb.kotlin.hws.hw1.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var ui: ActivityMainBinding

    private val dataClassTest = DataClassTest("Ivan",5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)

        ui.dataClassName.text = dataClassTest.name
        ui.dataClassAge.text = dataClassTest.age.toString()

        ui.copyButton.setOnClickListener {
            val dataClassTestCopy = dataClassTest.copy(dataClassTest.name,6)
            ui.dataClassAgeCopy.text = dataClassTestCopy.name
            ui.dataClassAge.text = dataClassTestCopy.age.toString()
        }

        ui.copyButton.setOnClickListener {
            for(i in 1..10) {
                when (i) {
                    1 -> {
                        Log.d(TAG, "I want a lot of money")
                    }
                    2 -> {
                        Log.d(TAG, "I want a lot of money twice")
                    }
                    else -> {
                        Log.d(TAG, "I want a lot of money $i times")
                    }
                }
            }
            repeat(10){
                Log.d(TAG, "it:$it")
            }
        }
    }

}