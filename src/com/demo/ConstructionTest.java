package com.demo;

public class ConstructionTest {
	
	public static void main(String[] args) {
		Teacher t = new Teacher("zhangsan",23);
		/**
		 * 程序默认会去调用对象的toString方法
		 */
		System.out.println(t);
		System.out.println();
		System.out.println(t.toString());
	}
}
