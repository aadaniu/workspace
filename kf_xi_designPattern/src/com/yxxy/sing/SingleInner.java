package com.yxxy.sing;

/***
 * ��̬�ڲ��� ���������� ����ػ��� ��֤�̰߳�ȫ���� �Ƿ��������ӳټ��أ� �������ӳټ���
 * 
 * @version
 */

public class SingleInner {

	private SingleInner() {
		System.out.println("�ұ�������.....");
	}

	/**
	 * @author admin
	 */
	private static class SingleInnerHolder {
		private static SingleInner sli = new SingleInner();

	}

	/***
	 * �Ͷ���ʽһ�����õ���classloader���ƣ���֤���̰߳�ȫ���⣬���ǺͶ���ʽ��ͨ���ǣ���̬�ڲ���ͬ�������ӳټ��ء�
	 */
	public static SingleInner getInstance() {
		return SingleInnerHolder.sli;
	}
}
