package com.yxxy.sing;

/**
 * 懒汉式，完成单例模式 静态的全局变量 初始化放在了静态方法中 延迟产生了 延迟产生了实例
 * 
 * @version 1.0
 */
public class Singlelazy3 {
	/**
	 * 提供静态的全局变量 作为入口 但是不立即加载
	 */
	private static Singlelazy3 sl = null;

	/**
	 * 构造器私有
	 * 
	 */
	private Singlelazy3() {
		// 构造器被调用
		System.out.println("构造器被调用了......");

	}

	/**
	 * 提供方法获取该类的实例
	 * 
	 * @return
	 * 
	 * 		方法：给获取实例进行加锁 synchronized 锁方法 先锁再判断
	 */
	public static Singlelazy3 getInstance() {
		synchronized (Singlelazy3.class) {
			if (sl == null) {
				sl = new Singlelazy3();
			}
		}
		/**
		 * 以上方法确实满足了要求，当有多个线程同时访问getInstance()。保证了多个线程是以流式、次序行的进入当前方法来获取该类的实例，那么效率一样很低。
		 * 而且多个线程同时等待；
		 **/
		return sl;
	}

}
