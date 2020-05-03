package com.simona.anomis.animapp.dynamicapi25

import android.os.Bundle
import android.view.*
import androidx.core.view.GestureDetectorCompat
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_dynamic_spring.*

class DynamicSpringFragment : Fragment(), View.OnTouchListener {

    private lateinit var gestureDetector: GestureDetectorCompat

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_dynamic_spring, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gestureDetector = GestureDetectorCompat(context, CustomGestureListener(bottom_sheet))
        bottom_sheet.setOnTouchListener(this)
    }

    override fun onTouch(view: View?, event: MotionEvent?): Boolean {
        return gestureDetector.onTouchEvent(event)
    }

    private class CustomGestureListener(var view: View) :
        GestureDetector.SimpleOnGestureListener() {

        override fun onFling(
            e1: MotionEvent?,
            e2: MotionEvent?,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
//            springAnim.spring.dampingRatio = SpringForce.DAMPING_RATIO_HIGH_BOUNCY
//            springAnim.spring.stiffness = SpringForce.STIFFNESS_LOW
            SpringAnimation(view, DynamicAnimation.Y).animateToFinalPosition(0F)
            return super.onFling(e1, e2, velocityX, velocityY)
        }

        override fun onDown(e: MotionEvent?): Boolean {
            return true
        }
    }
}