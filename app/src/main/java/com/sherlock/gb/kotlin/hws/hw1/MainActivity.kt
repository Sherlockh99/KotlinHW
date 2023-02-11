package com.sherlock.gb.kotlin.hws.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sherlock.gb.kotlin.hws.hw1.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding!!

    private val dataClassTest = DataClassTest("test",5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.param1.text = dataClassTest.param1
        binding.param2.text = dataClassTest.param2.toString()

        binding.button1.setOnClickListener {
            val dataClassTestCopy = dataClassTest.copy(dataClassTest.param1,6)
            binding.param1Copy.text = dataClassTestCopy.param1
            binding.param2Copy.text = dataClassTestCopy.param2.toString()
        }

        binding.button2.setOnClickListener {
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

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}