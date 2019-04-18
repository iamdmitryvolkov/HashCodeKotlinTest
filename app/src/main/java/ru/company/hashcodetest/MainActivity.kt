package ru.company.hashcodetest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        LambdaTest().test()
        Log.d("HashCode", HashCodeTest("str", 0).hashCode().toString())
    }
}
