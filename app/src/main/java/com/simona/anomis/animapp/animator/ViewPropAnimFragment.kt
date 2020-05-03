package com.simona.anomis.animapp.animator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast.*
import androidx.fragment.app.Fragment
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_view_prop_anim.*

class ViewPropAnimFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_view_prop_anim, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image.setOnClickListener {
            it.animate()
                .translationY(300F)
                .scaleX(2F)
                .alpha(0.5F)
                .setDuration(3000)
                .withEndAction { makeText(requireContext(), "Animation Done", LENGTH_SHORT).show() }
        }
    }
}