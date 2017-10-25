package io.github.mindjet.livemvvm.helper

import android.app.Activity
import java.util.*

/**
 * A helper to maintain the stack of Activity.
 * Created by Mindjet on 2017/10/25.
 */
object ActivityStack {

    private val stack = Stack<Activity>()

    fun register(activity: Activity) {
        stack.push(activity)
    }

    fun unregister(activity: Activity) {
        val top = stack.peek()
        if (top == activity) stack.pop()
    }

    fun currentActivity(): Activity {
        return stack.peek()
    }

    fun closeCurrentActivity() {
        val top = stack.peek()
        top.finish()
    }

}