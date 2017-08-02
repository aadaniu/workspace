package com.yxxy.sing;

/**
 * ����ʽ����ɵ���ģʽ ��̬��ȫ�ֱ��� ��ʼ�������˾�̬������ �ӳٲ����� �ӳٲ�����ʵ��
 * 
 * @version 1.0
 */
public class Singlelazy3 {
	/**
	 * �ṩ��̬��ȫ�ֱ��� ��Ϊ��� ���ǲ���������
	 */
	private static Singlelazy3 sl = null;

	/**
	 * ������˽��
	 * 
	 */
	private Singlelazy3() {
		// ������������
		System.out.println("��������������......");

	}

	/**
	 * �ṩ������ȡ�����ʵ��
	 * 
	 * @return
	 * 
	 * 		����������ȡʵ�����м��� synchronized ������ �������ж�
	 */
	public static Singlelazy3 getInstance() {
		synchronized (Singlelazy3.class) {
			if (sl == null) {
				sl = new Singlelazy3();
			}
		}
		/**
		 * ���Ϸ���ȷʵ������Ҫ�󣬵��ж���߳�ͬʱ����getInstance()����֤�˶���߳�������ʽ�������еĽ��뵱ǰ��������ȡ�����ʵ������ôЧ��һ���ܵ͡�
		 * ���Ҷ���߳�ͬʱ�ȴ���
		 **/
		return sl;
	}

}
