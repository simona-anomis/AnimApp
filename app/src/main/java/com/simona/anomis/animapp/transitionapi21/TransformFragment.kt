package com.simona.anomis.animapp.transitionapi21

import android.graphics.Rect
import android.os.Bundle
import android.transition.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_transform.*

class TransformFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_transform, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val transitionSet = TransitionSet().apply {
            addTransition(ChangeTransform())
            addTransition(ChangeImageTransform())
            addTransition(ChangeClipBounds())
        }
        image1.setOnClickListener {
            TransitionManager.beginDelayedTransition(root, transitionSet)
            image1.scaleX = 2.0f
            image1.scaleY = 2.0f
            image2.rotation = 45F
//            image3.scaleType = ImageView.ScaleType.CENTER
            image3.clipBounds = Rect(0, 0, 200, 400)
        }
    }
}