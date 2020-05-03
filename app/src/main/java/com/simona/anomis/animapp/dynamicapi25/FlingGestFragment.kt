package com.simona.anomis.animapp.dynamicapi25

import android.os.Bundle
import android.view.*
import androidx.core.view.GestureDetectorCompat
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.FlingAnimation
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_fling_gest.*

class FlingGestFragment : Fragment(), View.OnTouchListener {

    private lateinit var gestureDetector1: GestureDetectorCompat
    private lateinit var gestureDetector2: GestureDetectorCompat
    private lateinit var gestureDetector3: GestureDetectorCompat

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_fling_gest, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gestureDetector1 = GestureDetectorCompat(context, CustomGestureListener(image1, 0F, 1500F))
        gestureDetector2 = GestureDetectorCompat(context, CustomGestureListener(image2, 0F, 1500F))
        gestureDetector3 = GestureDetectorCompat(context, CustomGestureListener(image3, 0F, 1500F))
        image1.setOnTouchListener(this)
        image2.setOnTouchListener(this)
        image3.setOnTouchListener(this)
    }

    override fun onTouch(view: View?, event: MotionEvent?): Boolean {
        return when (view) {
            image1 -> gestureDetector1.onTouchEvent(event)
            image2 -> gestureDetector2.onTouchEvent(event)
            image3 -> gestureDetector3.onTouchEvent(event)
            else -> false
        }
    }

    private class CustomGestureListener(var view: View, var min: Float, var max: Float) :
        GestureDetector.SimpleOnGestureListener() {

        override fun onFling(
            e1: MotionEvent?,
            e2: MotionEvent?,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
            FlingAnimation(view, DynamicAnimation.Y)
                .setMinValue(min)
                .setMaxValue(max)
                .setStartVelocity(velocityY)
                .start()
            return super.onFling(e1, e2, velocityX, velocityY)
        }

        override fun onDown(e: MotionEvent?): Boolean {
            return true
        }
    }
}