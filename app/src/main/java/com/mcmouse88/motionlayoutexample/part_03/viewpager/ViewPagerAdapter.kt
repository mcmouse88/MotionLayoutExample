package com.mcmouse88.motionlayoutexample.part_03.viewpager

import android.util.SparseArray
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

data class Page(
    val title: String,
    val fragment: Fragment
)

class ViewPagerAdapter(
    private val pages: SparseArray<Page>,
    fragment: Fragment
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return pages.size()
    }

    override fun createFragment(position: Int): Fragment {
        val page = pages[position]
        return page.fragment.apply {
            arguments =  bundleOf(PageFragment.ARGS_KEY to page.title)
        }
    }
}