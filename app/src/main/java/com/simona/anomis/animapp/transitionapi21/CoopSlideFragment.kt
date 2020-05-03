package com.simona.anomis.animapp.transitionapi21

import android.os.Bundle
import android.transition.Slide
import android.transition.TransitionManager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_expl_slide.*

class CoopSlideFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_coop_slide, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image1.setOnClickListener {
            for (i in 0 until root.childCount) {
                val currView = root.getChildAt(i)
                TransitionManager.beginDelayedTransition(root, Slide(Gravity.END))
                currView.visibility =
                    if (currView.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
            }
        }
        image2.setOnClickListener {
            for (i in 0 until root.childCount) {
                val currView = root.getChildAt(i)
                currView.postDelayed({
                    TransitionManager.beginDelayedTransition(root, Slide(Gravity.END))
                    currView.visibility =
                        if (view.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
                }, 300L * i)
            }
        }
    }
}