package com.mcmouse88.motionlayoutexample.part_03.viewpager

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mcmouse88.motionlayoutexample.R
import com.mcmouse88.motionlayoutexample.databinding.FragmentPageBinding

class PageFragment : Fragment(R.layout.fragment_page) {

    private var _binding: FragmentPageBinding? = null
    private val binding: FragmentPageBinding
        get() = _binding ?: error("FragmentPageBinding is null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentPageBinding.bind(view)

        val args = requireArguments().getString(ARGS_KEY)
        binding.title.text = args
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    companion object {
        const val ARGS_KEY = "title"
    }
}