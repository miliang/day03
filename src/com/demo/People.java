package com.demo;

public class People {
	private String name;
	int age;
	private static String guoJi;
	/**
	 * static 静态的
	 * 修饰变量 变量就是静态变量（公共的变量）
	 * 
	 * static 修饰的变量和方法可以直接通过类名.变量名/方法名调用----非私有
	 *
	 *static关键字的特点：
	 *	a.随着类的加载而加载
	 *	b.优先于对象存在
	 *	c.被类的所有对象共享
	 *	d.可以通过类名调用
	 *		其实它本身也可以通过对象名调用。
	 * 		推荐使用类名调用。
	 * 		静态修饰的内容一般我们称其为：与类相关的，类成员
	 *
	 *
	 */
	public People(){
		
	}
	public People(String name,int age){
		this.name = name;
		this.age = age;
	}
	public People(String name, int age, String guoJi) {
		this.name = name;
		this.age = age;
		this.guoJi = guoJi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static String getGuoJi() {
		return guoJi;
	}
	public static void setGuoJi(String guoJi) {
		People.guoJi = guoJi;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	
}
