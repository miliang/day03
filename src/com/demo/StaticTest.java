package com.demo;

public class StaticTest {
	private int c;
	
	public static void main(String[] args) {
		People p1 = new People("张丹",23);
		p1.setGuoJi("中国");
		People p2 = new People("李四",24);
		People p3 = new People("王五",25);
		People p4 = new People("周丽",26);
		People p5 = new People("啦啦啦",27);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}
	/**
	 * 静态中只能使用静态，非静态中可以使用静态和非静态
	 * 
	 */
	//静态方法
	public static void a(){
		
	}
	//非静态方法
	public void b(){
		System.out.println(c);
		a();
	}
}
