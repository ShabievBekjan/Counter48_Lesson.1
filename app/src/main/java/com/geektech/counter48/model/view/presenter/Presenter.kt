package com.geektech.counter48.model.view.presenter

import com.geektech.counter48.model.CounterModel
import com.geektech.counter48.model.view.CounterView


class Presenter {
    private val model = CounterModel()
    lateinit var view: CounterView
    fun increment() {
        model.increment()
        view.updateCounter(model.count)
        if (model.getCount() == 10){
            view.showToast()
        }else if (model.getCount() == 15){
            view.setColor()

        }}


    fun attachView(view: CounterView) {
        this.view = view
    }}