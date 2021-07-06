package com.srjons.mockito

class SamplePresenter {

    private var view: View? = null


    fun attachView(view: View) {
        this.view = view
    }

    fun detachView() {
        this.view = null
    }

    fun checkString(string: String) {
        if (string.isBlank()){
            view?.checkStringResult(false)
        } else {
            view?.checkStringResult(true)
        }
    }


    interface View {
        fun checkStringResult(result: Boolean)
    }
}