package com.yujin.viewpager_210824.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.yujin.viewpager_210824.fragments.BirthYearFragment
import com.yujin.viewpager_210824.fragments.HelloFragment
import com.yujin.viewpager_210824.fragments.NameFragment

class MainViewPagerAdapter( fm : FragmentManager ) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "이름"
            1 -> "인사"
            else -> "출생년도"
        }
    }

    override fun getCount(): Int {

        return 3

    }

    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> HelloFragment()
            1 -> NameFragment()
            else -> BirthYearFragment()
        }


    }

}