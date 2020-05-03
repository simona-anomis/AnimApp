package com.simona.anomis.animapp.main

import android.os.Bundle
import android.transition.Explode
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import com.simona.anomis.animapp.animationapi.AnimApiFragment
import com.simona.anomis.animapp.animationapi.AnimBackFragment
import com.simona.anomis.animapp.animationapi.AnimListenFragment
import com.simona.anomis.animapp.animationapi.AnimResFragment
import com.simona.anomis.animapp.animator.AnimatorResFragment
import com.simona.anomis.animapp.animator.ObjAnimFragment
import com.simona.anomis.animapp.animator.ObjAnimSetFragment
import com.simona.anomis.animapp.animator.ViewPropAnimFragment
import com.simona.anomis.animapp.constraintlayout.ConstraintFragment
import com.simona.anomis.animapp.constraintlayout.ConstraintPlaceholderFragment
import com.simona.anomis.animapp.constraintlayout.ConstraintSetFragment
import com.simona.anomis.animapp.dynamicapi25.DynamicFlingFragment
import com.simona.anomis.animapp.dynamicapi25.DynamicSpringFragment
import com.simona.anomis.animapp.dynamicapi25.FlingGestFragment
import com.simona.anomis.animapp.lottie.LottieFragment
import com.simona.anomis.animapp.motionlayout.CustomMotionFragment
import com.simona.anomis.animapp.motionlayout.KeyframeMotionFragment
import com.simona.anomis.animapp.motionlayout.SimpleMotionFragment
import com.simona.anomis.animapp.transition.SimpleTransFragment
import com.simona.anomis.animapp.transition.TransResFragment
import com.simona.anomis.animapp.transitionapi21.*
import com.simona.anomis.animapp.vector.AnimVectFragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButtons()
    }

    private fun setupButtons() {
        constraint_button.setOnClickListener {
            goTo(ConstraintFragment())
        }
        constraint_set_button.setOnClickListener {
            goTo(ConstraintSetFragment())
        }
        constraint_placeholder_button.setOnClickListener {
            goTo(ConstraintPlaceholderFragment())
        }
        anim_api_button.setOnClickListener {
            goTo(AnimApiFragment())
        }
        anim_res_button.setOnClickListener {
            goTo(AnimResFragment())
        }
        anim_listen_button.setOnClickListener {
            goTo(AnimListenFragment())
        }
        anim_back_button.setOnClickListener {
            goTo(AnimBackFragment())
        }
        anim_back_button.setOnClickListener {
            goTo(AnimBackFragment())
        }
        obj_anim_button.setOnClickListener {
            goTo(ObjAnimFragment())
        }
        obj_anim_set_button.setOnClickListener {
            goTo(ObjAnimSetFragment())
        }
        view_prop_button.setOnClickListener {
            goTo(ViewPropAnimFragment())
        }
        animator_res_button.setOnClickListener {
            goTo(AnimatorResFragment())
        }
        simple_trans_button.setOnClickListener {
            goTo(SimpleTransFragment())
        }
        trans_res_button.setOnClickListener {
            goTo(TransResFragment())
        }
        expl_slide_button.setOnClickListener {
            goTo(ExplSlideFragment())
        }
        coop_slide_button.setOnClickListener {
            goTo(CoopSlideFragment())
        }
        shared_elem_button.setOnClickListener {
            goTo(SharedElemFragment1())
        }
        transf_button.setOnClickListener {
            goTo(TransformFragment())
        }
        window_transf_button.setOnClickListener {
            goToWithTransition()
        }
        vector_anim_button.setOnClickListener {
            goTo(AnimVectFragment())
        }
        dynam_fling_button.setOnClickListener {
            goTo(DynamicFlingFragment())
        }
        fling_gest_button.setOnClickListener {
            goTo(FlingGestFragment())
        }
        spring_gest_button.setOnClickListener {
            goTo(DynamicSpringFragment())
        }
        lottie_button.setOnClickListener {
            goTo(LottieFragment())
        }
        simple_motion_button.setOnClickListener {
            goTo(SimpleMotionFragment())
        }
        custom_swipe_button.setOnClickListener {
            goTo(CustomMotionFragment())
        }
        keyframe_motion_button.setOnClickListener {
            goTo(KeyframeMotionFragment())
        }
    }

    private fun goTo(fragment: Fragment) {
        requireActivity().supportFragmentManager.beginTransaction()
            .add(R.id.main_fragment, fragment, "MAIN")
            .addToBackStack("MAIN").commit()
    }

    private fun goToWithTransition() {
        val explode = Explode().apply { duration = 2000 }
        val fragment = WindowTransFragment().apply {
            enterTransition = explode
            exitTransition = explode
        }
        requireActivity().supportFragmentManager.beginTransaction()
            .add(R.id.main_fragment, fragment, "MAIN")
            .addToBackStack("MAIN").commit()
    }
}
