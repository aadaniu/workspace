package com.yxxy.test01;

/***
 * ��߿���Ч�� A �������Զ��ṩ���췽�� Ĭ���޲ι��� a���޲ι��췽�� �ڴ������� -source-Generate Constructors from
 * SuperClass alt+shift+s c b�����ι��췽�� �ڴ������� -source-Generate Constructors using
 * fields --finished alt+shift+s o B �ɶԵ�get xxxx() �� setxxxx() alt+shift+s r
 * 
 *****/

public class Student {
	private String name;
	private int age;

	// ���췽��
	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println("������" + name + ",����:" + age);
	}

}
