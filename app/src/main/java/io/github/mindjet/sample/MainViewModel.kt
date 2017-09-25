package io.github.mindjet.sample

import android.databinding.ViewDataBinding
import io.github.mindjet.livemvvm.viewmodel.BaseViewModel

/**
 * Created by Mindjet on 2017/9/25.
 */
class MainViewModel<B : ViewDataBinding> : BaseViewModel<B, MainModel>() {

    override fun onChange(data: MainModel) {

    }

}