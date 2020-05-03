package com.simona.anomis.animapp.lottie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R

class LottieFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_lottie, container, false)

    /* To start Lottie programmatically
        (lottie_view as LottieAnimationView).playAnimation()
    */
}