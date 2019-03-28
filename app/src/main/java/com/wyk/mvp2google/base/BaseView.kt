package com.wyk.mvp2google.base

interface BaseView<T> {
    fun setPresenter(presenter: T)
}