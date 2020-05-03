package com.simona.anomis.animapp.dynamicapi25

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.dynamicanimation.animation.DynamicAnimation
import androidx.dynamicanimation.animation.FlingAnimation
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_dynamic_fling.*
import kotlin.math.abs

class DynamicFlingFragment : Fragment() {

    private var velocity = 500F // Pixels per second

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_dynamic_fling, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val images = arrayOf(image1, image2, image3)
        go_button.setOnClickListener {
            val image = images[(0..2).random()]
            if (image.y == (container.height - image.height).toFloat()) velocity *= -1
            else if (image.y == 0F) velocity = abs(velocity)
            FlingAnimation(image, DynamicAnimation.Y).apply {
                setMinValue(0F)
                setMaxValue((container.height - image.height).toFloat())
                setStartVelocity(velocity)
                start()
            }
            // Can also control friction and velocity
        }
    }
}