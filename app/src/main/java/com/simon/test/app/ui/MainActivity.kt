package com.simon.test.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.simon.test.app.R
import com.simon.test.app.databinding.ActivityMainBinding
import com.simon.test.library.fragments.TestFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // set fragment in code
        val fragment = TestFragment()
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.fragment_container, fragment)
        fm.commit()
    }
}