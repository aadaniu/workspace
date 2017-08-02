package com.yxxy.sing;

/**
 * 懒汉式，完成单例模式 静态的全局变量 初始化放在了静态方法中 延迟产生了 延迟产生了实例
 * 
 * @version 1.0
 */
public class Singlelazy4 {
	/**
	 * 提供静态的全局变量 作为入口 但是不立即加载
	 */
	private static Singlelazy4 sl = null;

	/**
	 * 构造器私有
	 * 
	 */
	private Singlelazy4() {
		// 构造器被调用
		System.out.println("构造器被调用了......");

	}

	/**
	 * 提供方法获取该类的实例 双重检测 是线程安全的，实例化延迟了，然后jdk1.5版本，dcl(double check
	 * locking)是不稳定的(jvm).有时可能会创建多个实例 1.5之后加入了volatile修饰变量，达到了稳定的效果。 双重判定
	 * 第一个判断加锁 保证创建出来的实例是唯一的， 第二个判断为了保证不再进行等锁 方法：给获取实例进行加锁
	 * synchronized、对象、class、this
	 * 
	 * @return
	 */
	public static Singlelazy4 getInstance() {
		if (sl == null) {
			synchronized (Singlelazy4.class) {
				if (sl == null) {
					sl = new Singlelazy4();
				}
			}
		}
		return sl;
	}
}
