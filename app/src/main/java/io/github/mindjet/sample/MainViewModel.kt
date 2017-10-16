package io.github.mindjet.sample

import io.github.mindjet.livemvvm.viewmodel.BaseViewModel
import io.github.mindjet.sample.databinding.ActivityMainBinding

/**
 * Created by Mindjet on 2017/9/25.
 */
class MainViewModel: BaseViewModel<ActivityMainBinding>() {

    val content: String = "This is a ViewModel"

    override fun onAttached(binding: ActivityMainBinding) {

    }

}