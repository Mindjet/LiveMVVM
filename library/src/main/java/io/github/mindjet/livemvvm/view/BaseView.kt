package io.github.mindjet.livemvvm.view

import android.databinding.ViewDataBinding
import android.support.annotation.LayoutRes
import io.github.mindjet.livemvvm.viewmodel.BaseViewModel

/**
 * Created by Mindjet on 2017/9/25.
 */
interface BaseView<B : ViewDataBinding> {

    @LayoutRes
    fun needLayoutId(): Int

    fun needViewModel(): BaseViewModel<B>

}