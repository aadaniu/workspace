package com.yxxy.sing;

/**
 * ����ʽ����ɵ���ģʽ ��̬��ȫ�ֱ��� ��ʼ�������˾�̬������ �ӳٲ����� �ӳٲ�����ʵ��
 * 
 * @version 1.0
 */
public class Singlelazy4 {
	/**
	 * �ṩ��̬��ȫ�ֱ��� ��Ϊ��� ���ǲ���������
	 */
	private static Singlelazy4 sl = null;

	/**
	 * ������˽��
	 * 
	 */
	private Singlelazy4() {
		// ������������
		System.out.println("��������������......");

	}

	/**
	 * �ṩ������ȡ�����ʵ�� ˫�ؼ�� ���̰߳�ȫ�ģ�ʵ�����ӳ��ˣ�Ȼ��jdk1.5�汾��dcl(double check
	 * locking)�ǲ��ȶ���(jvm).��ʱ���ܻᴴ�����ʵ�� 1.5֮�������volatile���α������ﵽ���ȶ���Ч���� ˫���ж�
	 * ��һ���жϼ��� ��֤����������ʵ����Ψһ�ģ� �ڶ����ж�Ϊ�˱�֤���ٽ��е��� ����������ȡʵ�����м���
	 * synchronized������class��this
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
