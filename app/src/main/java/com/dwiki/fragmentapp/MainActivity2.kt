package com.dwiki.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.dwiki.fragmentapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = FragmentSatu()
        val secondFragment = FragmentDua()
        val thirdFragment = FragmentTiga()

        setCurrentFragment(firstFragment)

        binding.bnLayout.setOnItemSelectedListener{
            when(it.itemId){
                R.id.person -> {
                    setCurrentFragment(firstFragment)
                    true
                }
                R.id.home -> {
                    setCurrentFragment(secondFragment)
                    true
                }
                R.id.setting-> {
                    setCurrentFragment(thirdFragment)
                    true
                }
                else -> false
            }
        }


    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
            commit()

        }
    }
}

