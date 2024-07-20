package com.mcmouse88.motionlayoutexample.part_02

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mcmouse88.motionlayoutexample.R
import com.mcmouse88.motionlayoutexample.databinding.FragmentPart02Binding
import com.mcmouse88.motionlayoutexample.navigate

class Part02Fragment : Fragment(R.layout.fragment_part_02) {

    private var _binding: FragmentPart02Binding? = null
    private val binding: FragmentPart02Binding
        get() = _binding ?: error("FragmentPart02Binding is null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPart02Binding.bind(view)

        binding.btnExample03.setOnClickListener {
            parentFragmentManager.navigate(Example03Fragment::class.java)
        }

        binding.btnExample04.setOnClickListener {
            parentFragmentManager.navigate(Example04Fragment::class.java)
        }

        binding.btnExample05.setOnClickListener {
            parentFragmentManager.navigate(Example05Fragment::class.java)
        }

        binding.btnExample06.setOnClickListener {
            parentFragmentManager.navigate(Example06Fragment::class.java)
        }

        binding.btnExample07.setOnClickListener {
            parentFragmentManager.navigate(Example07Fragment::class.java)
        }
    }
}