package com.example.recyclerassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FibonacciAdapter(fibonacciNumbers: MutableList<Int>) {

}

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    lateinit var adapter:FibonacciAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val fibonacciNumbers = printFibonacciNumbers()
        adapter = FibonacciAdapter(fibonacciNumbers)
        recyclerView.adapter - adapter
    }

    fun printFibonacciNumbers(): MutableList<Int> {
        val fibonacciNumbers = mutableListOf<Int>()
        fibonacciNumbers.add(0)
        fibonacciNumbers.add(1)
        for (i in 2 until 100){
            val nums = fibonacciNumbers[i-1]+fibonacciNumbers[i-2]
            fibonacciNumbers.add(nums)
        }
        return fibonacciNumbers
}


