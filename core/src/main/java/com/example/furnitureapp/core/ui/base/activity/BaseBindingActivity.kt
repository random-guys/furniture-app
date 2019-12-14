package com.example.furnitureapp.core.ui.base.activity

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * Created by kryptkode on 12/10/2019.
 */
abstract class BaseBindingActivity<D> : BaseActivity() where D : ViewDataBinding {
    protected lateinit var binding: D
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
    }

    private fun initBinding() {
        binding = DataBindingUtil.setContentView(this, getLayoutResourceId())
        binding.lifecycleOwner = this
    }

    @LayoutRes
    protected abstract fun getLayoutResourceId(): Int
}