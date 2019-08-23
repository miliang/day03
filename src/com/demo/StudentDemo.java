package com.demo;

public class StudentDemo {
	public static void main(String[] args) {
		Student student = new Student();
		/**
		 * 匿名对象------------没有名字的对象
		 * 匿名对象使用的场景：
		 * 1、调用方法，仅仅只调用一次的时候
		 * 匿名调用的好处：节省代码
		 * 注意：调用多次的时候，不合适。匿名对象调用完毕就是垃圾，
		 * 可以被垃圾器回收
		 * 2、匿名对象可以作为实际数传递
		 * 
		 */
		new Student().sleep("Tom");
		new Student().name = "啦啦啦啦";
		
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.sex);
		student.sleep("啦啦啦");
		student.eat();
		student.study();
	}
}
