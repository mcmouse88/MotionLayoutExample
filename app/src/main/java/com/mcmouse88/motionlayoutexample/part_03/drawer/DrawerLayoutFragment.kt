package com.mcmouse88.motionlayoutexample.part_03.drawer

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mcmouse88.motionlayoutexample.R
import com.mcmouse88.motionlayoutexample.databinding.FragmentDrawerLayoutBinding

class DrawerLayoutFragment : Fragment(R.layout.fragment_drawer_layout) {

    private var _binding: FragmentDrawerLayoutBinding? = null
    private val binding: FragmentDrawerLayoutBinding
        get() = _binding ?: error("FragmentDrawerLayoutBinding is null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDrawerLayoutBinding.bind(view)

        binding.menu.setNavigationOnClickListener {
            binding.motionLayout.open()
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}