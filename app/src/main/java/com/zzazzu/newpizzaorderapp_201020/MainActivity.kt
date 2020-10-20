package com.zzazzu.newpizzaorderapp_201020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zzazzu.newpizzaorderapp_201020.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mViewPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun setupEvents() {

    }

    override fun setValues() {

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mViewPagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)

    }

}