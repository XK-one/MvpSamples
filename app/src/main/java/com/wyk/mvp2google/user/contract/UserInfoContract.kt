package com.wyk.mvp2google.user.contract

import com.wyk.mvp2google.base.BasePresenter
import com.wyk.mvp2google.base.BaseView
import com.wyk.mvp2google.user.model.UserInfoModel

interface UserInfoContract {
    interface Presenter: BasePresenter{
       fun loadUserInfo()
       fun loadUserInfo(params: UserInfoModel)
    }
    interface View: BaseView<Presenter>{
        fun showUserInfo(userInfo: UserInfoModel)
        fun getUserId(): String
        fun showLoading()
        fun dismissLoading()
    }
}