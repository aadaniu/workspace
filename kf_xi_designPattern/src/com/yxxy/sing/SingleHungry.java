package com.yxxy.sing;

/*
 * 通过饿汉式创建单例模式：
 * 	当前类只能创建一个对象
 * 	饿汉式： 天然就是线程安全的
 * 		类只要被加载，就会被加载到全局变量中  所以饿汉式就是及时加载（没有懒加载）
 * 单例模式如何避开反射和序列化 这个坑 
 *  * 
 * 	Judy 416854027
 * 	Lucy 487015644
 * @author
 * @date
 * @version 1.0
 * 
 * */

public class SingleHungry {

	// 提供一个静态的全局变量作为访问该实例的入口
	private static SingleHungry sh = new SingleHungry();

	/*
	 * 构造器私有，目的是不让外部通过new创建实例
	 * 
	 */
	private SingleHungry() {

	}

	/*
	 * 通过对外提供静态的方法 获取该类的实例
	 */
	public static SingleHungry getInstance() {
		// 还是new创建对象 每次的对象实例都不是唯一的
		return new SingleHungry();

	}

}
