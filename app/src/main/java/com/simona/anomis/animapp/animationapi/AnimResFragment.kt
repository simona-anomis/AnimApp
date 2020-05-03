package com.simona.anomis.animapp.animationapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_anim_res.*

class AnimResFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_anim_res, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image1.setOnClickListener {
            it.startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.anim_one))
            image2.startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.anim_two))
        }
    }
}