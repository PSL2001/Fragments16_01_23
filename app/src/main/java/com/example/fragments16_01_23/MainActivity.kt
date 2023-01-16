package com.example.fragments16_01_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.fragments16_01_23.fragments.BlueFragment
import com.example.fragments16_01_23.fragments.RedFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cargarFragments()
    }

    private fun cargarFragments() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<BlueFragment>(R.id.fcvBlu)
            add<RedFragment>(R.id.fcvRed)
            addToBackStack("add")
        }
    }
}