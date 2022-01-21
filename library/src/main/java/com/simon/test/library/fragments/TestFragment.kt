package com.simon.test.library.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.simon.test.databinding.FragmentTestBinding


open class TestFragment : Fragment() {

    private lateinit var binding: FragmentTestBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestBinding.inflate(inflater, container, false)

        return binding.root
    }
}