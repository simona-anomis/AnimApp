package com.simona.anomis.animapp.transitionapi21

import android.os.Bundle
import android.transition.Explode
import android.transition.Slide
import android.transition.TransitionManager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_expl_slide.*

class ExplSlideFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_expl_slide, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image1.setOnClickListener {
            TransitionManager.beginDelayedTransition(root, Explode())
            it.visibility = if (it.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
        }
        image2.setOnClickListener {
            TransitionManager.beginDelayedTransition(root, Slide(Gravity.END))
            it.visibility = if (it.visibility == View.VISIBLE) View.INVISIBLE else View.VISIBLE
        }
    }
}