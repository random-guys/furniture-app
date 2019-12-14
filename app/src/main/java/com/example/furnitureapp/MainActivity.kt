package com.example.furnitureapp

import android.os.Bundle
import android.os.Handler
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.furniture.profile.ui.ProfileFragment
import com.example.furnitureapp.core.ui.base.activity.BaseBindingActivity
import com.example.furnitureapp.databinding.ActivityMainBinding
import com.example.furnitureapp.home.ui.HomeFragment
import com.example.furnitureapp.ui.cart.CartFragment
import com.example.furnitureapp.ui.favourite.FavouriteFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ncapdevi.fragnav.FragNavController

class MainActivity : BaseBindingActivity<ActivityMainBinding>(),
    BottomNavigationView.OnNavigationItemSelectedListener,
    FragNavController.RootFragmentListener {

    private var doubleBackToExitPressedOnce = false
    private var doubleBackToExitPressedOncePayment = false
    private var doubleBackToExitPressedOnceServices = false
    private var doubleBackToExitPressedOnceHelp = false

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)

        mNavController = FragNavController(supportFragmentManager, R.id.container)
        mNavController?.apply {
            createEager = true
            fragmentHideStrategy = FragNavController.DETACH_ON_NAVIGATE_HIDE_ON_SWITCH
            rootFragmentListener = this@MainActivity
            initialize(savedInstanceState = savedInstanceState)
        }
    }


    override fun setUp() {
        binding.navigation.apply {
            enableAnimation(false)
            enableItemShiftingMode(false)
            enableShiftingMode(false)
            onNavigationItemSelectedListener = this@MainActivity
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                if (doubleBackToExitPressedOnce) mNavController?.clearStack()
                this.doubleBackToExitPressedOnce = true
                Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 1000)
                mNavController?.switchTab(INDEX_HOME)
            }
            R.id.nav_profile -> {
                if (doubleBackToExitPressedOnceHelp) mNavController?.clearStack()
                this.doubleBackToExitPressedOnceHelp = true
                Handler().postDelayed({ doubleBackToExitPressedOnceHelp = false }, 1000)
                mNavController?.switchTab(INDEX_PROFILE)
            }
            R.id.nav_cart -> {
                if (doubleBackToExitPressedOnceServices) mNavController?.clearStack()
                this.doubleBackToExitPressedOnceServices = true
                Handler().postDelayed({ doubleBackToExitPressedOnceServices = false }, 1000)
                mNavController?.switchTab(INDEX_SHOPPING_CART)
            }
            R.id.nav_favourite -> {
                if (doubleBackToExitPressedOncePayment) mNavController?.clearStack()
                this.doubleBackToExitPressedOncePayment = true
                Handler().postDelayed({ doubleBackToExitPressedOncePayment = false }, 1000)
                mNavController?.switchTab(INDEX_FAVOURITE)
            }
        }
        return true
    }

    override val numberOfRootFragments: Int = 4

    override fun getLayoutResourceId() = R.layout.activity_main


    override fun getRootFragment(index: Int): Fragment {
        return when (index) {
            INDEX_HOME -> HomeFragment.newInstance()
            INDEX_PROFILE -> ProfileFragment.newInstance()
            INDEX_SHOPPING_CART -> CartFragment.newInstance()
            INDEX_FAVOURITE -> FavouriteFragment.newInstance()
            else -> throw IllegalStateException("Need to send an index that we know")
        }
    }

    companion object {
        private const val INDEX_HOME = FragNavController.TAB1
        private const val INDEX_PROFILE = FragNavController.TAB4
        private const val INDEX_SHOPPING_CART = FragNavController.TAB3
        private const val INDEX_FAVOURITE = FragNavController.TAB2

    }
}
