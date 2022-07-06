package io.manycore.robotcoder.demo

import android.R
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Copy paste from Glide repo on https://github.com/bumptech/glide
        val imageView: ImageView = findViewById<View>(R.id.my_image_view) as ImageView
        Glide.with(this).load("http://goo.gl/gEgYUd").into(imageView)
    }
}