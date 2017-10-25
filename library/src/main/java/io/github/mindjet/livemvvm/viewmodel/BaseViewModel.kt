package io.github.mindjet.livemvvm.viewmodel

import android.arch.lifecycle.ViewModel
import android.databinding.ViewDataBinding
import io.github.mindjet.livemvvm.BR
import io.github.mindjet.livemvvm.view.BaseActivity
import java.lang.ref.WeakReference

/**
 * Created by Mindjet on 2017/9/25.
 */
abstract class BaseViewModel<B : ViewDataBinding> : ViewModel() {

    protected var binding: B? = null
    protected val context by lazy { binding?.root?.context }
    protected val activity by lazy { boundActivity?.get() }

    private var boundActivity: WeakReference<BaseActivity<B>>? = null

    fun onAttachedWithActivity(binding: B, baseActivity: BaseActivity<B>) {
        this.binding = binding
        this.binding?.setVariable(BR.data, this)
        this.boundActivity = WeakReference(baseActivity)
        onAttachedTheFirstTime(binding)
        onAttached(binding)
    }

    protected open fun onAttachedTheFirstTime(binding: B) {

    }

    protected open fun onAttached(binding: B) {

    }

    open fun onDetached() {

    }

    open fun onBackPressed(): Boolean {
        return false
    }

    open fun onResume() {

    }

    open fun onStart() {

    }

    open fun onPause() {

    }

    open fun onStop() {

    }

}