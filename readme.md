####Readme


契约接口

 - BaseView<T>接口 :   T是Presenter类的类型，主要是将Presenter类让View持有
 - UserInfoContract 接口：提供两个内部接口，View和Presenter 

	- View接口继承BaseView，针对逻辑 提供不同操作UI的抽象方法
	- Presenter接口继承BasePresenter , 针对逻辑 提供不同操作数据的抽象方法


抽象(接口)

 - BasePresenter接口：提供了一个抽象方法，约定了所有的Presenter的初始化操作都放在			start()方法中