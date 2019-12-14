package com.example.furnitureapp.core.ui.base.activity


import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.furnitureapp.core.R
import com.google.android.material.snackbar.Snackbar
import com.ncapdevi.fragnav.FragNavController
import com.ncapdevi.fragnav.FragNavTransactionOptions
import dagger.android.support.DaggerAppCompatActivity

abstract class BaseActivity : DaggerAppCompatActivity() {

    var mNavController: FragNavController? = null

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setUp()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mNavController?.onSaveInstanceState(outState)
    }

    fun pushFragment(fragment: Fragment, transactionOptions: FragNavTransactionOptions? = null) {
        mNavController?.pushFragment(fragment, transactionOptions)
    }

    fun replaceFragment(fragment: Fragment, transactionOptions: FragNavTransactionOptions? = null) {
        mNavController?.replaceFragment(fragment, transactionOptions)
    }

    fun clearFragments() {
        mNavController?.clearStack()
    }

    fun showDialog(dialogFragment: DialogFragment) {
        mNavController?.showDialogFragment(dialogFragment)
    }

    fun hideDialog() {
        mNavController?.clearDialogFragment()
    }

    fun popFragments(depth: Int = 0) {
        if (depth > 0) mNavController?.popFragments(depth) else mNavController?.popFragment()
    }

    fun notifyUser(message: String?) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun notifyUser(view: View, message: String) {
        val snackBar = Snackbar.make(view, message, Snackbar.LENGTH_LONG)
        /* FrameLayout.LayoutParams param = (FrameLayout.LayoutParams) snackBar.getView().getLayoutParams();*/
        val snackBarLayout = snackBar.view as Snackbar.SnackbarLayout
        snackBarLayout.setBackgroundColor(ContextCompat.getColor(view.context, R.color.colorAccent))
        (snackBarLayout.findViewById<View>(com.google.android.material.R.id.snackbar_text) as TextView)
            .setTextColor(ContextCompat.getColor(applicationContext, android.R.color.white))
        /*snackBar.getView().setLayoutParams(param);*/
        snackBar.show()
    }

    abstract fun setUp()
}
