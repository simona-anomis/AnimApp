package com.simona.anomis.animapp.animationapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_anim_listen.*

class AnimListenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_anim_listen, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image1.setOnClickListener {
            val viewAnimation1 = AnimationUtils.loadAnimation(requireContext(), R.anim.anim_one)
            val viewAnimation2 = AnimationUtils.loadAnimation(requireContext(), R.anim.anim_two)
            viewAnimation1.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationRepeat(animation: Animation?) {
                }
                override fun onAnimationEnd(animation: Animation?) {
                    image2.startAnimation(viewAnimation2)
                }
                override fun onAnimationStart(animation: Animation?) {
                }
            })
            it.startAnimation(viewAnimation1)
        }
    }
}