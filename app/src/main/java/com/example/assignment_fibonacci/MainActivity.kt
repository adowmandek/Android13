package com.example.assignment_fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
        lateinit var rvNumber: RecyclerView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            displayNumber()
        }
        fun displayNumber(){
            rvNumber=findViewById(R.id.rvNumbers)
            var numbersList= listOf<String>("0", "1", "1", "2", "3", "5", "8", "13", "21", "34")
            var numbersAdapter=NumberRVAdapter(numbersList)
            rvNumber.layoutManager= LinearLayoutManager(baseContext)
            rvNumber.adapter=numbersAdapter

        }

    }


