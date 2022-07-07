package io.manycore.robotcoder.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.manycore.robotcoder.demo.utils.Init

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val i = Init(baseContext)
    }
}