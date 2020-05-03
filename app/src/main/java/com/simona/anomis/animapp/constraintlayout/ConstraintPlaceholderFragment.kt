package com.simona.anomis.animapp.constraintlayout

import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.Transition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_constraint_placeholder.*

class ConstraintPlaceholderFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_constraint_placeholder, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image1.setOnClickListener(this)
        image2.setOnClickListener(this)
        image3.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val transition: Transition = ChangeBounds().apply {
            interpolator = BounceInterpolator()
            duration = 2000
        }
        placeholder.setContentId(view.id)
        TransitionManager.beginDelayedTransition(rootLayout, transition)
    }
}