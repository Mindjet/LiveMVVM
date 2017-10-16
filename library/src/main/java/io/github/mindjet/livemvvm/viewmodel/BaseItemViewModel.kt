package io.github.mindjet.livemvvm.viewmodel

import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes

/**
 * Created by Mindjet on 2017/10/16.
 */
abstract class BaseItemViewModel<B : ViewDataBinding> : BaseViewModel<B>() {

    @LayoutRes
    abstract fun getLayoutId(): Int

    fun onAttachedToAdapter(binding: B) {
        if (mBinding == null) {
            mBinding = binding
            onAttachedTheFirstTime(binding)
            onAttached(binding)
        } else {
            onAttached(binding)
        }
    }

}