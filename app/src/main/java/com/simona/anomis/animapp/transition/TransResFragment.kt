package com.simona.anomis.animapp.transition

import android.os.Bundle
import android.transition.Scene
import android.transition.TransitionInflater
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_simple_trans_1.root
import kotlinx.android.synthetic.main.fragment_trans_res_1.*

class TransResFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_trans_res_1, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loginScene =
            Scene.getSceneForLayout(root, R.layout.fragment_trans_res_2, requireContext())
        val signupScene =
            Scene.getSceneForLayout(root, R.layout.fragment_trans_res_3, requireContext())
        // Can also be done with a TransitionSet - add all
        val transitionMgr = TransitionInflater.from(context)
            .inflateTransitionManager(R.transition.transition_mgr, root);
        login.setOnClickListener { transitionMgr.transitionTo(loginScene) }
        signup.setOnClickListener { transitionMgr.transitionTo(signupScene) }
    }
}