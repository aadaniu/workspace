package com.yxxy.sing;

/***
 * 静态内部类 创建单例： 类加载机制 保证线程安全问题 是否做到了延迟加载？ 做到了延迟加载
 * 
 * @version
 */

public class SingleInner {

	private SingleInner() {
		System.out.println("我被调用了.....");
	}

	/**
	 * @author admin
	 */
	private static class SingleInnerHolder {
		private static SingleInner sli = new SingleInner();

	}

	/***
	 * 和饿汉式一样采用的是classloader机制，保证了线程安全问题，但是和饿汉式不通的是，静态内部类同样满足延迟加载。
	 */
	public static SingleInner getInstance() {
		return SingleInnerHolder.sli;
	}
}
