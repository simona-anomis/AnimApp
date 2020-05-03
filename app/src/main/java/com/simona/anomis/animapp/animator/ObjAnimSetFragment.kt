package com.simona.anomis.animapp.animator

import android.animation.AnimatorSet
import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.graphics.Color.*
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_obj_anim_set.*

class ObjAnimSetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_obj_anim_set, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val translateAnim = ObjectAnimator.ofFloat(click_me, "translationY", 300F).apply {
            repeatMode = ValueAnimator.REVERSE
            repeatCount = ValueAnimator.INFINITE
        }
        val xScaleAnim = ObjectAnimator.ofFloat(click_me, "scaleX", 3F).apply {
            repeatMode = ValueAnimator.REVERSE
            repeatCount = ValueAnimator.INFINITE
        }
        val colorAnim =
            ObjectAnimator.ofObject(click_me, "textColor", ArgbEvaluator(), RED, GREEN).apply {
                repeatMode = ValueAnimator.REVERSE
                repeatCount = ValueAnimator.INFINITE
            }
        val set = AnimatorSet().apply {
            // Or play sequentially
            playTogether(translateAnim, xScaleAnim, colorAnim)
            duration = 1000
        }
        click_me.setOnClickListener {
            if (set.isRunning) set.end()
            else set.start()
        }
    }
}