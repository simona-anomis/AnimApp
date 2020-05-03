package com.simona.anomis.animapp.vector

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_anim_vect.*

class AnimVectFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_anim_vect, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image1.setOnClickListener {
            (image1.drawable as AnimatedVectorDrawable).start()
            (image2.drawable as AnimatedVectorDrawable).start()
            (image3.drawable as AnimatedVectorDrawable).start()
        }
    }
}