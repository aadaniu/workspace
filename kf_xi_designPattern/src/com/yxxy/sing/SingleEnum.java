package com.yxxy.sing;

public enum SingleEnum {

	// 定义实例化对象
	INSTANCE;

	/***
	 * 对象执行的功能 枚举的单例模式 不可能出现序列化、反射构建对象的漏洞；原因： 不能做到延迟加载，默认情况下，枚举实例的创建都是线程安全的。
	 * 但是实例对象实现的方法需要自己保证。 线程安全、确保单例 防止反射构建对象 没有序列化问题
	 */
	public void getIntance() {

	}

}
