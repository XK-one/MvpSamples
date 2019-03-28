package com.wyk.mvp2google.user.presenter

import android.os.Handler
import com.wyk.mvp2google.user.contract.UserInfoContract
import com.wyk.mvp2google.user.model.UserInfoModel

class UserInfoPresenter(val view: UserInfoContract.View): UserInfoContract.Presenter {
    init {
        view.setPresenter(this)
    }

    override fun loadUserInfo() {
        val userId = view.getUserId()
        view.showLoading()
        Handler().postDelayed({
            val userInfoModel = UserInfoModel("shuidao", 3)
            view.dismissLoading()
            view.showUserInfo(userInfoModel)
        }
        ,3000)
    }
    override fun loadUserInfo(params: UserInfoModel) {
        val userId = view.getUserId()
        view.showLoading()
        Handler().postDelayed({
            view.dismissLoading()
            view.showUserInfo(params)
        },3000)
    }

    //存放初始化所有Presenter的操作
    override fun start() {
        loadUserInfo()
    }

}