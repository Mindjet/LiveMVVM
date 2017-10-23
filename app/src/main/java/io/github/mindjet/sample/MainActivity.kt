package io.github.mindjet.sample

import io.github.mindjet.livemvvm.view.BaseActivity
import io.github.mindjet.livemvvm.viewmodel.BaseViewModel
import io.github.mindjet.sample.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun needLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun needViewModel(): BaseViewModel<ActivityMainBinding> {
        return MainViewModel()
    }
}
