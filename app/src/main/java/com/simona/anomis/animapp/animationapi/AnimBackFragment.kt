package com.simona.anomis.animapp.animationapi

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_anim_back.*

class AnimBackFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_anim_back, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val animationDrawable = start_button.background as AnimationDrawable
        var animationRunning = false
        start_button.setOnClickListener {
            if (animationRunning) {
                animationDrawable.stop()
                start_button.text = "Start"
                animationRunning = false
            } else {
                animationDrawable.start()
                start_button.text = "Stop"
                animationRunning = true
            }
        }
    }
}