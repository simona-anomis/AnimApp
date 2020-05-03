package com.simona.anomis.animapp.animationapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.ScaleAnimation
import android.view.animation.TranslateAnimation
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_anim_api.*

class AnimApiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_anim_api, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val translate = TranslateAnimation(0F, 200F, 0F, 200F)
        val rotate = RotateAnimation(0F, 360F)
        val scale = ScaleAnimation(0F, 3F, 0F, 3F)
        val animationSet = AnimationSet(requireContext(), null).apply {
            addAnimation(translate)
            addAnimation(rotate)
            addAnimation(scale)
            duration = 3000
        }
        image.setOnClickListener { it.startAnimation(animationSet) }
    }
}