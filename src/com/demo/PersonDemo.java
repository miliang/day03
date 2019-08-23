package com.demo;

public class PersonDemo {
	/**
	 * 写在方法中的变量	(局部变量-----方法中		没有默认值，要使用必须赋值)
	 * 类中方法外的变量	(成员变量------类中		有默认值)
	 */
	
	public static void main(String[] args) {
		/**
		 * 通过类来创建一个对象
		 */
		//声明对象的名字 = 创建对象的实例
		//类名  变量名 = new	类名();
		Person p  = new  Person();
		String name = p.name;
		int age = p.age;
		System.out.println(age);
	}
}
