package io.github.mindjet.livemvvm.viewmodel

import android.arch.lifecycle.ViewModel
import android.databinding.ViewDataBinding
import io.github.mindjet.livemvvm.BR

/**
 * Created by Mindjet on 2017/9/25.
 */
abstract class BaseViewModel<B : ViewDataBinding> : ViewModel() {

    protected var mBinding: B? = null

    fun onAttachedWithActivity(binding: B) {
        mBinding = binding
        mBinding?.setVariable(BR.data, this)
        onAttachedTheFirstTime(binding)
        onAttached(binding)
    }

    protected open fun onAttachedTheFirstTime(binding: B) {

    }

    protected open fun onAttached(binding: B) {

    }

    open fun onDetached() {

    }

}