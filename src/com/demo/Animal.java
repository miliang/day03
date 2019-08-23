package com.demo;

public class Animal {
	/**
	 * 封装的概述：指隐藏对象的属性和实现的细节，仅对外提供公共访问方式。
	 * 
	 * 封装的好处：
	 * 		1、隐藏实现细节，提高公共的访问方式；
	 * 		2、提高了代码的复用性；
	 * 		3、提高安全性；
	 * 
	 * 封装原则：1、将不需要对外提供的内容都隐藏起来；
	 * 			2、把属性隐藏，提供公共方法对其访问；
	 */
	//private	私有的，受保护的
	/**
	 * private关键字的特点
	 * 		1、是一个权限修饰符(修饰符有private，public，default)
	 * 		2、可以修饰成员变量和成员方法，不能修饰局部变量；
	 * 		3、被其修饰的成员只能在本类访问
	 */
	/**
	 * 被private 修饰的变量只能在本类使用
	 * this 指代当前的对象，即谁来调用我，我就代表谁
	 * 
	 * this的应用场景
	 * 		用来区分成员变量和局部变量重名
	 */
	
	private String name;
	private int age;
	
	public void getThis(){
		System.out.println(this);
	}
	/**
	 * 对外提供公共访问的方式
	 * 两个方法  getXX()和setXX()
	 */
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

}
