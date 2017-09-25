package io.github.mindjet.livemvvm.viewmodel

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import android.databinding.ViewDataBinding
import io.github.mindjet.livemvvm.livedata.BaseLiveData
import io.github.mindjet.livemvvm.model.BaseModel

/**
 * Created by Mindjet on 2017/9/25.
 */
abstract class BaseViewModel<B : ViewDataBinding, M : BaseModel> : ViewModel() {

    protected var mBinding: B? = null
    protected var mLiveData: BaseLiveData<M>? = BaseLiveData()

    fun setBinding(binding: B) {
        mBinding = binding
    }

    fun startObserve(owner: LifecycleOwner) {
        mLiveData?.observe(owner, Observer { onChange(it!!) })
    }

    abstract fun onChange(data: M)

    fun onAttached() {

    }

}