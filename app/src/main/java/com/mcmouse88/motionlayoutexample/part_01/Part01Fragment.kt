package com.mcmouse88.motionlayoutexample.part_01

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mcmouse88.motionlayoutexample.R
import com.mcmouse88.motionlayoutexample.databinding.FragmentPart01Binding
import com.mcmouse88.motionlayoutexample.navigate

class Part01Fragment : Fragment(R.layout.fragment_part_01) {

    private var _binding: FragmentPart01Binding? = null
    private val binding: FragmentPart01Binding
        get() = _binding ?: error("FragmentPart01Binding is null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPart01Binding.bind(view)

        binding.btnExample01.setOnClickListener {
            parentFragmentManager.navigate(Example01Fragment::class.java)
        }

        binding.btnExample02.setOnClickListener {
            parentFragmentManager.navigate(Example02Fragment::class.java)
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}