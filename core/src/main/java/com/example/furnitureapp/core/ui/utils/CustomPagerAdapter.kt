package com.example.furnitureapp.core.ui.utils

import android.util.SparseArray
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import java.lang.ref.WeakReference
import java.util.*

open class CustomPagerAdapter(manager: FragmentManager) : FragmentStatePagerAdapter(manager) {
    private val instantiatedFragments = SparseArray<WeakReference<Fragment>>()
    private val mFragmentList = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fragment: Fragment, title: String = "") {
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val fragment = super.instantiateItem(container, position) as Fragment
        instantiatedFragments.put(position, WeakReference(fragment))
        return fragment
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        instantiatedFragments.remove(position)
        super.destroyItem(container, position, `object`)
    }

    internal fun getFragment(position: Int): Fragment? {
        val wr = instantiatedFragments.get(position)
        return wr?.get()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitleList[position]
    }
}