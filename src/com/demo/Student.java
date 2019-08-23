package com.demo;

public class Student {
	/**
	 * 局部变量和成员变量重名的情况下，采用就近原则
	 */
	String name = "张三";
	int age = 23;
	String sex = "男";
	public void study(){
		System.out.println("会学习");
	}
	public void sleep(String name){
		System.out.println(name + "会休息");
	}
	public void eat(){
		System.out.println("会吃饭");
	}
}
