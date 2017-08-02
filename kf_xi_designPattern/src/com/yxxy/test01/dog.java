package com.yxxy.test01;

/**
 * 是注解 意思是说，我这个方法是重写父类的 如果和父类类名出现了偏差就会报错
 */
public abstract class dog extends Animal {

	@Override
	public abstract void eat();

	public void sleep() {

	}

}
