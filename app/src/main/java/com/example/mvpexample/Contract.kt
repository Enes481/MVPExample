package com.example.mvpexample

interface Contract {

    interface View {
        fun showProgressBar()
        fun hideProgressBar()
        fun setString(string: String?)
    }

    interface Model {
        interface OnFinishedListener {
            fun onFinished(string: String?)
        }
        fun getNextCourse(onFinishedListener: OnFinishedListener?)
    }

    interface Presenter {
        fun onButtonClick()
        fun onDestroy()
    }
}