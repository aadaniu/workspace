package com.yxxy.sing;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ����ʽ����ɵ���ģʽ ��̬��ȫ�ֱ��� ��ʼ�������˾�̬������ �ӳٲ����� �ӳٲ�����ʵ��
 * 
 * @version 1.0
 */
public class Singlelazy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3617881809983912694L;
	/**
	 * �ṩ��̬��ȫ�ֱ��� ��Ϊ��� ���ǲ���������
	 */
	private static Singlelazy sl = null;

	/**
	 * ������˽��
	 * 
	 */
	private Singlelazy() {
		if (sl != null) {
			throw new RuntimeException();
		}
		// ������������
		System.out.println("��������������......");

	}

	/**
	 * �ṩ������ȡ�����ʵ��
	 * 
	 * @return
	 * 
	 * 		����������ȡʵ�����м��� synchronized ������ public static synchronized
	 *         Singlelazy getInstance()
	 */
	public static Singlelazy getInstance() {
		// �鿴�Ƿ���ڶ��� �������򴴽� ������ֱ�ӷ��ش����õ�
		if (sl == null) {
			sl = new Singlelazy();
		}
		return sl;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO �Զ����ɵķ������
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO �Զ����ɵķ������
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
