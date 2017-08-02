package com.yxxy.test01;

/***
 * 提高开发效率 A 帮我们自动提供构造方法 默认无参构造 a、无参构造方法 在代码区域 -source-Generate Constructors from
 * SuperClass alt+shift+s c b、带参构造方法 在代码区域 -source-Generate Constructors using
 * fields --finished alt+shift+s o B 成对的get xxxx() 和 setxxxx() alt+shift+s r
 * 
 *****/

public class Student {
	private String name;
	private int age;

	// 构造方法
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
		System.out.println("姓名：" + name + ",年龄:" + age);
	}

}
