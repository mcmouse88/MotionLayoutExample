package com.mcmouse88.motionlayoutexample.part_03.viewpager

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.viewpager2.widget.ViewPager2

class ViewPagerHeader @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttrs: Int = 0
) : MotionLayout(context, attrs, defStyleAttrs) {

    val pageChangeListener = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
            val numPages = 3
            progress = (position + positionOffset) / (numPages - 1)
        }
    }
}