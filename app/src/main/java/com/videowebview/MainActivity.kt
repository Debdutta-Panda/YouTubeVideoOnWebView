package com.videowebview

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.youtubevideoviewlibrary.YoutubeView

class MainActivity : AppCompatActivity() {
    private var yv_video: YoutubeView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        WebView.setWebContentsDebuggingEnabled(true)

        yv_video = findViewById<View>(R.id.yv_video) as YoutubeView

        yv_video?.setVideo(true,"https://www.youtube.com/embed/e1C5WIfZ89s", startTime = "600")
    }

    override fun onBackPressed() {
        if (yv_video?.onBackPressed()==false) {
            super.onBackPressed()
        }
    }

    override fun onResume() {
        super.onResume()
        yv_video?.exitFullScreen()
    }
}