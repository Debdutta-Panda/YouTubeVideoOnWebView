package com.videowebview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.youtubevideoviewlibrary.YoutubeView

class HomePageFragment : Fragment() {
    private var yv_video: YoutubeView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        yv_video = view.findViewById<View>(R.id.yv_video) as YoutubeView

        yv_video?.setVideo(true,"https://www.youtube.com/embed/e1C5WIfZ89s", startTime = "600"){
            try {
                requireActivity()
            } catch (e: Exception) {
                null
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomePageFragment()
    }
}