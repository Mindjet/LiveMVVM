package io.github.mindjet.livemvvm.view

import android.databinding.ViewDataBinding
import io.github.mindjet.livemvvm.model.BaseModel
import io.github.mindjet.livemvvm.viewmodel.BaseViewModel

/**
 * Created by Mindjet on 2017/9/25.
 */
interface BaseView<B : ViewDataBinding, M : BaseModel> {

    fun getVariableId(): Int

    fun getLayoutId(): Int

    fun getViewModel(): BaseViewModel<B, M>

}