package com.demo;

public class StaticTest {
	private int c;
	
	public static void main(String[] args) {
		People p1 = new People("�ŵ�",23);
		p1.setGuoJi("�й�");
		People p2 = new People("����",24);
		People p3 = new People("����",25);
		People p4 = new People("����",26);
		People p5 = new People("������",27);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}
	/**
	 * ��̬��ֻ��ʹ�þ�̬���Ǿ�̬�п���ʹ�þ�̬�ͷǾ�̬
	 * 
	 */
	//��̬����
	public static void a(){
		
	}
	//�Ǿ�̬����
	public void b(){
		System.out.println(c);
		a();
	}
}
