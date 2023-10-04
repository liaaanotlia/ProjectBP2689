package com.example.projectbp2689

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.fragment.app.Fragment
import com.example.projectbp2689.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {

    //binding
    lateinit var binding: ActivityBookKidBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //event button utk call fragment
        binding.buttonFairy.setOnClickListener {
            replaceFragment(FairyFragment())
        }
        binding.buttonFable.setOnClickListener {
            replaceFragment(FableFragment())
        }
        binding.buttonScience.setOnClickListener {
            replaceFragment(ScienceFragment())
        }
    }

    //ganti fragment
    fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmenTrx = fragmentManager.beginTransaction()
        fragmenTrx.replace(R.id.fragmentKidBook, frg)
        fragmenTrx.commit()
    }
}