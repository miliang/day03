package com.demo;

public class People {
	private String name;
	int age;
	private static String guoJi;
	/**
	 * static ��̬��
	 * ���α��� �������Ǿ�̬�����������ı�����
	 * 
	 * static ���εı����ͷ�������ֱ��ͨ������.������/����������----��˽��
	 *
	 *static�ؼ��ֵ��ص㣺
	 *	a.������ļ��ض�����
	 *	b.�����ڶ������
	 *	c.��������ж�����
	 *	d.����ͨ����������
	 *		��ʵ������Ҳ����ͨ�����������á�
	 * 		�Ƽ�ʹ���������á�
	 * 		��̬���ε�����һ�����ǳ���Ϊ��������صģ����Ա
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
