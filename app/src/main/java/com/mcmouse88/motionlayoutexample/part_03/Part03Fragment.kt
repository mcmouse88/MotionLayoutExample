package com.mcmouse88.motionlayoutexample.part_03

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mcmouse88.motionlayoutexample.R
import com.mcmouse88.motionlayoutexample.databinding.FragmentPart03Binding
import com.mcmouse88.motionlayoutexample.navigate
import com.mcmouse88.motionlayoutexample.part_03.coordinator.CoordinatorLayoutFragment
import com.mcmouse88.motionlayoutexample.part_03.drawer.DrawerLayoutFragment
import com.mcmouse88.motionlayoutexample.part_03.viewpager.LottieFragment
import com.mcmouse88.motionlayoutexample.part_03.viewpager.ViewPagerFragment

class Part03Fragment : Fragment(R.layout.fragment_part_03) {

    private var _binding: FragmentPart03Binding? = null
    private val binding: FragmentPart03Binding
        get() = _binding ?: error("FragmentPart03Binding is null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPart03Binding.bind(view)

        binding.btnCoordinatorLayout.setOnClickListener {
            parentFragmentManager.navigate(CoordinatorLayoutFragment::class.java)
        }

        binding.btnDrawerLayout.setOnClickListener {
            parentFragmentManager.navigate(DrawerLayoutFragment::class.java)
        }

        binding.btnViewPager.setOnClickListener {
            parentFragmentManager.navigate(ViewPagerFragment::class.java)
        }

        binding.btnLottie.setOnClickListener {
            parentFragmentManager.navigate(LottieFragment::class.java)
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}