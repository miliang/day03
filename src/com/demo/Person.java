package com.demo;
/**
 * 定义一个类(类class 人类，动物类，汽车类...)
 * 对象(类的一个具体实例)
 * @author 12408
 *
 */
public class Person {
//	属性		(成员变量 ---- 写在类中方法外的变量)
	String name = "张丹";//姓名
	int age = 23;//年龄
	String sex = "男";//性别
	
//	行为		(成员方法----一般的方法)
	public void sleep(){
		System.out.println("人类会睡觉");
	}
	public void eat(){
		System.out.println("人类会吃饭");
	}
}
