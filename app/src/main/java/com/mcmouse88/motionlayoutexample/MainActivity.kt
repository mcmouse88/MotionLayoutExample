package com.mcmouse88.motionlayoutexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        supportFragmentManager.beginTransaction()
            .add(R.id.mainContainer, MainFragment::class.java, null)
            .commit()
    }
}