package com.example.furnitureapp.base


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.IdRes
import com.example.furnitureapp.R

abstract class BaseFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews(view)
        setUp(view)
    }

    protected fun <V : View> Fragment.bind(@IdRes resource: Int): V {
        val lazyValue: Lazy<V> = lazy { view?.findViewById<V>(resource)!! }
        return lazyValue.value
    }

    abstract fun bindViews(views: View)
    abstract fun setUp(view: View)
}
