package com.demo;

public class ConstructionTest {
	
	public static void main(String[] args) {
		Teacher t = new Teacher("zhangsan",23);
		/**
		 * ����Ĭ�ϻ�ȥ���ö����toString����
		 */
		System.out.println(t);
		System.out.println();
		System.out.println(t.toString());
	}
}
