package com.simona.anomis.animapp.motionlayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R

class SimpleMotionFragment : Fragment() {

    //Android 4.0 Canary - Motion Editor & Constraint Conversion to ML

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_simple_motion, container, false)
}