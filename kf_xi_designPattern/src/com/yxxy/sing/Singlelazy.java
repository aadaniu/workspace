package com.yxxy.sing;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式，完成单例模式 静态的全局变量 初始化放在了静态方法中 延迟产生了 延迟产生了实例
 * 
 * @version 1.0
 */
public class Singlelazy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3617881809983912694L;
	/**
	 * 提供静态的全局变量 作为入口 但是不立即加载
	 */
	private static Singlelazy sl = null;

	/**
	 * 构造器私有
	 * 
	 */
	private Singlelazy() {
		if (sl != null) {
			throw new RuntimeException();
		}
		// 构造器被调用
		System.out.println("构造器被调用了......");

	}

	/**
	 * 提供方法获取该类的实例
	 * 
	 * @return
	 * 
	 * 		方法：给获取实例进行加锁 synchronized 锁方法 public static synchronized
	 *         Singlelazy getInstance()
	 */
	public static Singlelazy getInstance() {
		// 查看是否存在对象 不存在则创建 存在则直接返回创建好的
		if (sl == null) {
			sl = new Singlelazy();
		}
		return sl;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO 自动生成的方法存根
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO 自动生成的方法存根
		super.finalize();
	}

	public int hashCode() {
		return sl.hashCode();
	}

	public boolean equals(Object obj) {
		return sl.equals(obj);
	}

	public String toString() {
		return sl.toString();
	}

	private Object readResolve() throws ObjectStreamException {
		return sl;
	}
}
