package com.demo;

public class Dog {
	/**
	 * 执行顺序
	 * 静态代码块 > 构造代码块 > 构造方法
	 */
	public Dog(){
		System.out.println("构造方法");
	}
	/**
	 * 构造代码块
	 */
	{
		System.out.println("构造代码块");
	}
	/**
	 * 静态代码块
	 * 字节码对象加载进方法区时会执行
	 */
	static{
		System.out.println("静态代码块");
	}
}
