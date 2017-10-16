package io.github.mindjet.livemvvm.viewmodel

import android.arch.lifecycle.ViewModel
import android.databinding.ViewDataBinding

/**
 * Created by Mindjet on 2017/9/25.
 */
abstract class BaseViewModel<B : ViewDataBinding> : ViewModel() {

    protected var mBinding: B? = null

    fun onAttachedWithActivity(binding: B) {
        mBinding = binding
        onAttachedTheFirstTime(binding)
        onAttached(binding)
    }

    protected fun onAttachedTheFirstTime(binding: B) {

    }

    protected fun onAttached(binding: B) {

    }

    fun onDetached() {

    }

}