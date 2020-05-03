package com.simona.anomis.animapp.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.simona.anomis.animapp.R
import com.simona.anomis.animapp.constraintlayout.ConstraintFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.main_fragment, MainFragment()).commit()
    }
}