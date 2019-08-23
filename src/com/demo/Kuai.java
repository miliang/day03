package com.demo;

public class Kuai {
	public static void main(String[] args) {
		/**
		 * 局部代码块-----------写在方法中
		 * 静态一定优于对象而存在
		 */
//		{
//			int a = 10;
//			System.out.println(a);
//		}
		Dog dog = new Dog();
		System.out.println("-----------------------------------------");
		Dog dog2 = new Dog();
		/**
		 * 执行结果如下：
		 * 静态代码块
		      构造代码块
		      构造方法
		   -----------------------------------------
		      构造代码块
		      构造方法
		 */
	}
}
