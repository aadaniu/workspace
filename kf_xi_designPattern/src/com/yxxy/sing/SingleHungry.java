package com.yxxy.sing;

/*
 * ͨ������ʽ��������ģʽ��
 * 	��ǰ��ֻ�ܴ���һ������
 * 	����ʽ�� ��Ȼ�����̰߳�ȫ��
 * 		��ֻҪ�����أ��ͻᱻ���ص�ȫ�ֱ�����  ���Զ���ʽ���Ǽ�ʱ���أ�û�������أ�
 * ����ģʽ��αܿ���������л� ����� 
 *  * 
 * 	Judy 416854027
 * 	Lucy 487015644
 * @author
 * @date
 * @version 1.0
 * 
 * */

public class SingleHungry {

	// �ṩһ����̬��ȫ�ֱ�����Ϊ���ʸ�ʵ�������
	private static SingleHungry sh = new SingleHungry();

	/*
	 * ������˽�У�Ŀ���ǲ����ⲿͨ��new����ʵ��
	 * 
	 */
	private SingleHungry() {

	}

	/*
	 * ͨ�������ṩ��̬�ķ��� ��ȡ�����ʵ��
	 */
	public static SingleHungry getInstance() {
		// ����new�������� ÿ�εĶ���ʵ��������Ψһ��
		return new SingleHungry();

	}

}
