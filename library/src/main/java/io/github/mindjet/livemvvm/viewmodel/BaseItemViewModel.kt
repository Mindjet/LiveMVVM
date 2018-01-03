package io.github.mindjet.livemvvm.viewmodel

import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import android.util.Log

/**
 * Created by Mindjet on 2017/10/16.
 */
abstract class BaseItemViewModel<B : ViewDataBinding> : BaseViewModel<B>() {

    private val TAG = "BaseItemViewModel"

    @LayoutRes
    abstract fun needLayoutId(): Int

    fun onAttachedToAdapter(binding: B) {
        try {
            val dump = this.binding
        } catch (e: UninitializedPropertyAccessException) {
            Log.i(TAG, "This is the first time ${this} attached to the adapter")
            this.binding = binding
            this.context = binding.root.context
            onAttachedTheFirstTime(binding)
        } finally {
            onAttached(binding)
        }
    }

}