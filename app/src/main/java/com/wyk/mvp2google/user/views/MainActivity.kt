package com.wyk.mvp2google.user.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.wyk.mvp2google.R
import com.wyk.mvp2google.user.contract.UserInfoContract
import com.wyk.mvp2google.user.model.UserInfoModel
import com.wyk.mvp2google.user.presenter.UserInfoPresenter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * MVP简单小例子
 */
class MainActivity : AppCompatActivity(),UserInfoContract.View {

    lateinit var mPresenter: UserInfoContract.Presenter

    override fun showUserInfo(userInfo: UserInfoModel) {
        userInfo?.let {
            textView.text = userInfo.toString()
        }
    }

    override fun getUserId() = "10001"
    override fun showLoading() {
        Toast.makeText(this@MainActivity, "正在加载数据", Toast.LENGTH_SHORT)
    }
    override fun dismissLoading() {
        Toast.makeText(this@MainActivity, "数据已加载完成", Toast.LENGTH_SHORT)
    }

    override fun setPresenter(presenter: UserInfoContract.Presenter) {
        this.mPresenter = presenter
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        UserInfoPresenter(this)
    }

    override fun onStart() {
        //mPresenter.start()
        button.setOnClickListener {
            mPresenter.start()
        }
        super.onStart()
    }

}
