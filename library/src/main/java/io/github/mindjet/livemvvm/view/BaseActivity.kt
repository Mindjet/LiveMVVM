package io.github.mindjet.livemvvm.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.mindjet.livemvvm.viewmodel.BaseViewModel

/**
 * Created by Mindjet on 2017/9/25.
 */

abstract class BaseActivity<B : ViewDataBinding> : AppCompatActivity(), BaseView<B> {

    private var binding: B? = null
    private var viewModel: BaseViewModel<B>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, needLayoutId())
        viewModel = ViewModelProviders.of(this).get(needViewModel().javaClass)
        viewModel?.onAttachedWithActivity(binding!!,this)
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel?.onDetached()
    }

}