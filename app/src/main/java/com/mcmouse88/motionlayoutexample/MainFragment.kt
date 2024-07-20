package com.mcmouse88.motionlayoutexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mcmouse88.motionlayoutexample.databinding.FragmentMainBinding
import com.mcmouse88.motionlayoutexample.part_01.Example01Fragment
import com.mcmouse88.motionlayoutexample.part_01.Example02Fragment

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
        get() = _binding ?: error("FragmentMainBinding is null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        binding.btnExample01.setOnClickListener {
            parentFragmentManager.navigate(Example01Fragment::class.java)
        }

        binding.btnExample02.setOnClickListener {
            parentFragmentManager.navigate(Example02Fragment::class.java)
        }
    }
}