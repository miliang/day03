package com.demo;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.setName("laalal");
		System.out.println(a.getName());
		System.out.println("=====================================");
		System.out.println(a);
		a.getThis();
		System.out.println("-------------------------------------");
		Animal a1 = new Animal();
		System.out.println(a1);
		a1.getThis();
	}
}
