package com.demo;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		/**
		 * ��������------------û�����ֵĶ���
		 * ��������ʹ�õĳ�����
		 * 1�����÷���������ֻ����һ�ε�ʱ��
		 * �������õĺô�����ʡ����
		 * ע�⣺���ö�ε�ʱ�򣬲����ʡ��������������Ͼ���������
		 * ���Ա�����������
		 * 2���������������Ϊʵ��������
		 * 
		 */
		new Student().sleep("Tom");
		new Student().name = "��������";
		
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.sex);
		student.sleep("������");
		student.eat();
		student.study();
	}
}
