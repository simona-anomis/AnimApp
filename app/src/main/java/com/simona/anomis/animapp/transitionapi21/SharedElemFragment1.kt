package com.simona.anomis.animapp.transitionapi21

import android.os.Bundle
import android.transition.*
import android.transition.TransitionSet.ORDERING_TOGETHER
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import com.simona.anomis.animapp.R
import kotlinx.android.synthetic.main.fragment_shared_elem_1.*

class SharedElemFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_shared_elem_1, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image.setOnClickListener {
            val set: Transition = TransitionSet().apply {
                ordering = ORDERING_TOGETHER
                addTransition(ChangeBounds())
                addTransition(ChangeTransform())
                addTransition(ChangeImageTransform())
                duration = 3000
                interpolator = FastOutSlowInInterpolator()
            }
            val fragment = SharedElemFragment2().apply {
                sharedElementEnterTransition = set
                sharedElementReturnTransition = set
            }
            requireActivity().supportFragmentManager.beginTransaction()
                .addSharedElement(image, "shared_elem")
                .replace(R.id.main_fragment, fragment)
                .addToBackStack(null)
                .commit()
        }
    }
}