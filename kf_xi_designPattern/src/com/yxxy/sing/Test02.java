package com.yxxy.sing;

/***
 * ��������ʽ �Ƿ���ڶ��̰߳�ȫ����
 * 
 * 
 * @version 1.0
 * 
 **/
public class Test02 {
	public static void main(String[] args) {
		// ���̲߳���
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