package com.mcmouse88.motionlayoutexample.part_03.viewpager

import android.os.Bundle
import android.util.SparseArray
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.mcmouse88.motionlayoutexample.R
import com.mcmouse88.motionlayoutexample.databinding.FragmentLottieBinding

class LottieFragment : Fragment(R.layout.fragment_lottie) {

    private var _binding: FragmentLottieBinding? = null
    private val binding: FragmentLottieBinding
        get() = _binding ?: error("FragmentLottieBinding is null")

    private val pageCallback get() = binding.parallax.motionLayout.pageChangeListener

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentLottieBinding.bind(view)

        val pages = SparseArray<Page>(3)
        repeat(3) {
            pages.append(it, Page(getString(R.string.page_value, it + 1), PageFragment()))
        }

        val adapter = ViewPagerAdapter(pages, this)
        binding.pager.adapter = adapter
        TabLayoutMediator(binding.tabs, binding.pager) { tab, position ->
            tab.text = pages[position].title
        }.attach()

        binding.pager.registerOnPageChangeCallback(pageCallback)
    }

    override fun onDestroyView() {
        binding.pager.unregisterOnPageChangeCallback(pageCallback)
        _binding = null
        super.onDestroyView()
    }
}