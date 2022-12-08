package com.geektech.counter48.model
class CounterModel {
    var count = 0
    fun increment() {
        ++count
    }
    @JvmName("getCount1")
    fun getCount():Int{
        return count
    }
}