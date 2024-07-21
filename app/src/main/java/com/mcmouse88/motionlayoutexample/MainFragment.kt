package com.mcmouse88.motionlayoutexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mcmouse88.motionlayoutexample.databinding.FragmentMainBinding
import com.mcmouse88.motionlayoutexample.part_01.Part01Fragment
import com.mcmouse88.motionlayoutexample.part_02.Part02Fragment
import com.mcmouse88.motionlayoutexample.part_03.Part03Fragment

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
        get() = _binding ?: error("FragmentMainBinding is null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        binding.btnPart01.setOnClickListener {
            parentFragmentManager.navigate(Part01Fragment::class.java)
        }

        binding.btnPart02.setOnClickListener {
            parentFragmentManager.navigate(Part02Fragment::class.java)
        }

        binding.btnPart03.setOnClickListener {
            parentFragmentManager.navigate(Part03Fragment::class.java)
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}