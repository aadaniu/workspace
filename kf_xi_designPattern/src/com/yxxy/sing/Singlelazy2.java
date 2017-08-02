package com.yxxy.sing;

/**
 * 懒汉式，完成单例模式 静态的全局变量 初始化放在了静态方法中 延迟产生了 延迟产生了实例
 * 
 * @version 1.0
 */
public class Singlelazy2 {
	/**
	 * 提供静态的全局变量 作为入口 但是不立即加载
	 */
	private static Singlelazy2 sl = null;

	/**
	 * 构造器私有
	 * 
	 */
	private Singlelazy2() {
		// 构造器被调用2
		System.out.println("构造器被调用了......");

	}

	/**
	 * 提供方法获取该类的实例
	 * 
	 * @return
	 * 
	 * 		方法：给获取实例进行加锁 synchronized 锁方法 public static synchronized
	 *         Singlelazy getInstance() 先判断再锁
	 */
	public static Singlelazy2 getInstance() {
		// 查看是否存在对象 不存在则创建 存在则直接返回创建好的
		if (sl == null) {
			/***
			 * 代码问题///多个线程进入访问时，如果两个线程同时进入判断， 可能会出现多个实例
			 * 
			 * 锁代码块 以上方式锁的颗粒度变小了，但是并不能产生一个实例，原因： 多个线程判断之后，全局变量都是null，进入之后都开始等锁。
			 * 线程1出去，线程2进来继续实例化 所以得到的对象是多个。
			 */
			synchronized (Singlelazy2.class) {
				sl = new Singlelazy2();
			}
		}
		return sl;
	}

}
