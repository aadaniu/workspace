package com.yxxy.sing;

/***
 * 测试懒汉式 是否存在多线程安全问题
 * 
 * 
 * @version 1.0
 * 
 **/
public class Test02 {
	public static void main(String[] args) {
		// 多线程测试
		ThreadTest ttTest = new ThreadTest();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();

	}

}

class ThreadTest implements Runnable {

	@Override
	public void run() {
		Singlelazy2.getInstance();
	}
}