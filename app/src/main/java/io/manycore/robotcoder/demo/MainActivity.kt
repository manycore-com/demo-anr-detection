package io.manycore.robotcoder.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val storageDirectory = getExternalFilesDir("your_path")?.absolutePath



        /*
        You're not supposed to do on the UI thread.
         */
        val file = File(
            storageDirectory)
            .walk()
            .forEach {
                Log.d("test", "File is" + it.canonicalPath)
            }
    }
}