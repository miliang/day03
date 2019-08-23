package com.demo;

public class Teacher {
	/**
	 * 每个类都会有一个方法，构造方法
	 * 权限修饰符(public.private)  类名(){
	 * 		方法体；
	 * }
	 *
	 * 在new对象时调用构造方法
	 *
	 * 构造方法发热概述和作用	----------- 给对象的数据(属性)进行初始化
	 * 构造方法格式特点：
	 * 		a.方法名与类名相同(大小写也要与类名一致)
	 * 		b.没有返回值类型，连void也没有
	 * 		c.没有具体的返回值return
	 *			
	 */
	private String name;
	private int age;
	
	/**
	 * 方法重载
	 * 同一个类中，方法名相同，参数不同(参数个数，参数类型，参数顺序)，
	 * 与返回值类型无关
	 * 
	 * 构造方法注意事项：
	 * 	a.如果我们没有给出构造方法，系统会默认提供一个无参的构造函数
	 *  b.如果我们给出了构造方法，系统将不再提供默认的无参构造方法
	 *  	注意：这个时候，如果我们还想使用无参构造方法，就必须自己给出。
	 *  建议永远自己给出无参构造方法
	 * 
	 * 给成员变量赋值的两种方式的区别
	 * setXxx()方法-------------修改属性值
	 * 构造方法-----------------给对象中的属性进行初始化
	 * 
	 */
	public Teacher(){
		System.out.println("无参构造函数");
	}
	public Teacher(String name){
		this.name = name;
	}
	public Teacher(String name,int age){
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	
}

