package com.yxxy.sing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���л��͵����Ĺ�ϵ
 * 
 * @version
 */

public class SerialTest {

	public static void main(String[] args) throws IOException {

		Singlelazy s1 = Singlelazy.getInstance();
		Singlelazy s2 = Singlelazy.getInstance();

		// ���л��������л�
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("d:/b.txt");
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close(); // ���л�

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/b.txt"));
		Singlelazy s3 = null;
		try {
			s3 = (Singlelazy) ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3); // �����л�
	}

}
