package com.yxxy.sing;

/**
 * ����ʽ����ɵ���ģʽ ��̬��ȫ�ֱ��� ��ʼ�������˾�̬������ �ӳٲ����� �ӳٲ�����ʵ��
 * 
 * @version 1.0
 */
public class Singlelazy2 {
	/**
	 * �ṩ��̬��ȫ�ֱ��� ��Ϊ��� ���ǲ���������
	 */
	private static Singlelazy2 sl = null;

	/**
	 * ������˽��
	 * 
	 */
	private Singlelazy2() {
		// ������������2
		System.out.println("��������������......");

	}

	/**
	 * �ṩ������ȡ�����ʵ��
	 * 
	 * @return
	 * 
	 * 		����������ȡʵ�����м��� synchronized ������ public static synchronized
	 *         Singlelazy getInstance() ���ж�����
	 */
	public static Singlelazy2 getInstance() {
		// �鿴�Ƿ���ڶ��� �������򴴽� ������ֱ�ӷ��ش����õ�
		if (sl == null) {
			/***
			 * ��������///����߳̽������ʱ����������߳�ͬʱ�����жϣ� ���ܻ���ֶ��ʵ��
			 * 
			 * ������� ���Ϸ�ʽ���Ŀ����ȱ�С�ˣ����ǲ����ܲ���һ��ʵ����ԭ�� ����߳��ж�֮��ȫ�ֱ�������null������֮�󶼿�ʼ������
			 * �߳�1��ȥ���߳�2��������ʵ���� ���Եõ��Ķ����Ƕ����
			 */
			synchronized (Singlelazy2.class) {
				sl = new Singlelazy2();
			}
		}
		return sl;
	}

}
