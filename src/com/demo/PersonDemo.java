package com.demo;

public class PersonDemo {
	/**
	 * д�ڷ����еı���	(�ֲ�����-----������		û��Ĭ��ֵ��Ҫʹ�ñ��븳ֵ)
	 * ���з�����ı���	(��Ա����------����		��Ĭ��ֵ)
	 */
	
	public static void main(String[] args) {
		/**
		 * ͨ����������һ������
		 */
		//������������� = ���������ʵ��
		//����  ������ = new	����();
		Person p  = new  Person();
		String name = p.name;
		int age = p.age;
		System.out.println(age);
	}
}
