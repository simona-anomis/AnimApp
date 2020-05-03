package com.simona.anomis.animapp.transition

import android.os.Bundle
import android.transition.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_simple_trans_1.*

class SimpleTransFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_simple_trans_1, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        click_me.setOnClickListener {
            val fade: Transition = Fade()
            val set = TransitionSet()
            val changeBounds: Transition = ChangeBounds()
            set.addTransition(fade).addTransition(changeBounds).setDuration(2000)
                .addListener(object : Transition.TransitionListener {
                    override fun onTransitionStart(transition: Transition) {}
                    override fun onTransitionEnd(transition: Transition) {
                        Toast.makeText(
                            requireContext(),
                            "Transition Ended",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    override fun onTransitionCancel(transition: Transition) {}
                    override fun onTransitionPause(transition: Transition) {}
                    override fun onTransitionResume(transition: Transition) {}
                })
            val scene2 = Scene.getSceneForLayout(
                    root,
                    R.layout.fragment_simple_trans_2,
                    requireContext()
                )
            TransitionManager.go(scene2, set)
        }
    }
}