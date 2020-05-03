package com.simona.anomis.animapp.constraintlayout

import android.os.Bundle
import android.transition.Fade
import android.transition.Transition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.View.*
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_constraint.*

class ConstraintFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_constraint, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        click_me.setOnClickListener {
            click_me.visibility = GONE
            group.visibility = VISIBLE
            val fade: Transition = Fade().apply { duration = 1000 }
            TransitionManager.beginDelayedTransition(root, fade)
        }
    }
}