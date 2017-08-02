package com.yxxy.sing;

/*
 * 1 需求：
 * car对象的创建 不要求每次创建一个新对象使用
 * 解决该问题的办法 就是通过采用单例模式去设计car类
 * 2 创建出来的对象 有且只有一个
 * 保证一个类只有一个实例，通过提供一个访问该实例的全局访问入口
 * 3 常用情景：
 * windows的任务管理器
 * 项目中的读取配置文件的对象
 * 数据库连接池
 * Servlet中的ApolicationContext、Servlet
 * Spring中的bean默认也是单例
 * 
 * 4 单例优点
 *  a 只生成一个实例 减少了开销、当一个对象需要产生时 消耗的资源较多时 那么该对象的构建就可以通过单例去设计
 *  b 单例模式存在一个全局访问点 所以优化共享资源
 * 5 常见的构建单例模式的方式：
 *  a 饿汉式
 *  b 懒汉式
 *  c 双重检测 dowble—T
 *  d 静态内部类
 *  e 枚举单例
 * 也有一个坑， 今天要避开这个
 * 
 * 饿汉式创建单例模式：
 *  
 * */
public class Test01 {
	public static void main(String[] args) {
		// 创建一个Car对象
		Car car = new Car();
		car.run();

		Car car1 = new Car();
		car.run();

		Car car2 = new Car();
		car.run();

	}

}

/*
 * 假设很消耗资源，而且使用过程中不会有其他内容。。。。
 * 
 * 
 */
class Car {
	public Car() {
		// xxxxxxxxxx

	}

	public void run() {
		System.out.println("run ...........");
	}
}
