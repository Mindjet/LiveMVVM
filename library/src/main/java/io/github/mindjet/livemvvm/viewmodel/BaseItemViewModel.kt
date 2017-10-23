package io.github.mindjet.livemvvm.viewmodel

import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes

/**
 * Created by Mindjet on 2017/10/16.
 */
abstract class BaseItemViewModel<B : ViewDataBinding> : BaseViewModel<B>() {

    @LayoutRes
    abstract fun needLayoutId(): Int

    fun onAttachedToAdapter(binding: B) {
        if (this.binding == null) {
            this.binding = binding
            onAttachedTheFirstTime(binding)
            onAttached(binding)
        } else {
            onAttached(binding)
        }
    }

    override fun getActivity(): Nothing {
        throw KotlinNullPointerException("BaseItemViewModel does not has a reference to activity.")
    }


}