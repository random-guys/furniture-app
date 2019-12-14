package com.example.furnitureapp.core.ui.base.fragment


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.furnitureapp.core.presentation.BaseViewModel
import com.example.furnitureapp.core.ui.base.activity.BaseActivity
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<D, V>(private val klazz: Class<V>) :
    DaggerFragment() where D : ViewDataBinding, V : BaseViewModel {

    protected lateinit var binding: D

    @Inject
    protected lateinit var viewModeFactory: ViewModelProvider.Factory

    protected val viewModel: V by lazy {
        ViewModelProviders.of(this, viewModeFactory)
            .get(klazz)
    }

    lateinit var baseActivity: BaseActivity private set

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return initBinding(inflater, container)
    }

    private fun initBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        binding = DataBindingUtil.inflate(inflater, getLayoutResourceId(), container, false)
        binding.lifecycleOwner = this
        return binding.root
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is BaseActivity) {
            val activity: BaseActivity = context
            baseActivity = activity
        }
    }

    fun notifyUser(message: String?) {
        baseActivity.notifyUser(message)
    }

    fun notifyUser(view: View, message: String) {
        baseActivity.notifyUser(view, message)
    }

    @LayoutRes
    protected abstract fun getLayoutResourceId(): Int

}
