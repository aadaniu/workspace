package com.shuiqing_02;

import com.shuiqing_01.Jump;
/**
 * ���Ǿ���Ĺ���
 * @author��
 * @version v1.0
 * */
public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("����ߵĹ�");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("��վ��˯��");
	}

}
