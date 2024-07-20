package com.mcmouse88.motionlayoutexample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.navigate(clazz: Class<out Fragment>): Int {
    return beginTransaction()
        .replace(R.id.mainContainer, clazz, null)
        .addToBackStack(null)
        .commit()
}