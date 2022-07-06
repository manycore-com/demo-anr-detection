package io.manycore.robotcoder.demo

import android.R
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var mp:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mp = MediaPlayer.create(this, R.raw.clip)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        mp.start()
    }

    override fun onStop() {
        super.onStop()
        mp.stop()
    }

}