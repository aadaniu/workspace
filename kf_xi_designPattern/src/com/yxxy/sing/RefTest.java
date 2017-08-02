package com.yxxy.sing;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RefTest {
	public static void main(String[] args) {
		Singlelazy s1 = Singlelazy.getInstance();
		Singlelazy s2 = Singlelazy.getInstance();

		// 通过反射获取对象
		Singlelazy s3 = null;
		try {
			Class clz = Class.forName("com.yxxy.sing.Singlelazy");
			Constructor c = clz.getDeclaredConstructor(null);
			c.setAccessible(true);
			s3 = (Singlelazy) c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
