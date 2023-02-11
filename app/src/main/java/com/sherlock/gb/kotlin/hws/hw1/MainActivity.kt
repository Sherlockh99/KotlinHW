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

    private val dataClassTest = DataClassTest("dddd",5)

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
                Log.d(TAG, "i:$i")
            }
            repeat(10){
                Log.d(TAG, "Хочу денег " + (it + 1)+ " раз!!!")
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}