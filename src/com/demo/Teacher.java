package com.demo;

public class Teacher {
	/**
	 * ÿ���඼����һ�����������췽��
	 * Ȩ�����η�(public.private)  ����(){
	 * 		�����壻
	 * }
	 *
	 * ��new����ʱ���ù��췽��
	 *
	 * ���췽�����ȸ���������	----------- �����������(����)���г�ʼ��
	 * ���췽����ʽ�ص㣺
	 * 		a.��������������ͬ(��СдҲҪ������һ��)
	 * 		b.û�з���ֵ���ͣ���voidҲû��
	 * 		c.û�о���ķ���ֵreturn
	 *			
	 */
	private String name;
	private int age;
	
	/**
	 * ��������
	 * ͬһ�����У���������ͬ��������ͬ(�����������������ͣ�����˳��)��
	 * �뷵��ֵ�����޹�
	 * 
	 * ���췽��ע�����
	 * 	a.�������û�и������췽����ϵͳ��Ĭ���ṩһ���޲εĹ��캯��
	 *  b.������Ǹ����˹��췽����ϵͳ�������ṩĬ�ϵ��޲ι��췽��
	 *  	ע�⣺���ʱ��������ǻ���ʹ���޲ι��췽�����ͱ����Լ�������
	 *  ������Զ�Լ������޲ι��췽��
	 * 
	 * ����Ա������ֵ�����ַ�ʽ������
	 * setXxx()����-------------�޸�����ֵ
	 * ���췽��-----------------�������е����Խ��г�ʼ��
	 * 
	 */
	public Teacher(){
		System.out.println("�޲ι��캯��");
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

