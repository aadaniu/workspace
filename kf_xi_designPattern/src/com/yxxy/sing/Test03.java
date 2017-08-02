package com.yxxy.sing;

public class Test03 {
	public static void main(String[] args) {
		// ¶àÏß³Ì²âÊÔ
		ThreadTest ttTest = new ThreadTest();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();
		new Thread(ttTest).start();

		System.out.println(SingleEnum.INSTANCE == SingleEnum.INSTANCE);

	}

	class ThreadTest01 implements Runnable {

		@Override

		public void run() {
			SingleInner.getInstance();
		}
	}
}
