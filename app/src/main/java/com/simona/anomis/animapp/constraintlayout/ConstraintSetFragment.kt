package com.simona.anomis.animapp.constraintlayout

import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.Transition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.OvershootInterpolator
import androidx.constraintlayout.widget.ConstraintSet
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_constrain_set_1.*

class ConstraintSetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_constrain_set_1, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        click_me.setOnClickListener {
            ConstraintSet().apply {
                clone(requireActivity(), R.layout.fragment_constraint_set_2)
                applyTo(root)
            }
            val transition: Transition = ChangeBounds().apply {
                interpolator = OvershootInterpolator()
                duration = 2000
            }
            TransitionManager.beginDelayedTransition(root, transition)
        }
    }
}