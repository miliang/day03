package com.demo;

public class Animal {
	/**
	 * ��װ�ĸ�����ָ���ض�������Ժ�ʵ�ֵ�ϸ�ڣ��������ṩ�������ʷ�ʽ��
	 * 
	 * ��װ�ĺô���
	 * 		1������ʵ��ϸ�ڣ���߹����ķ��ʷ�ʽ��
	 * 		2������˴���ĸ����ԣ�
	 * 		3����߰�ȫ�ԣ�
	 * 
	 * ��װԭ��1��������Ҫ�����ṩ�����ݶ�����������
	 * 			2�����������أ��ṩ��������������ʣ�
	 */
	//private	˽�еģ��ܱ�����
	/**
	 * private�ؼ��ֵ��ص�
	 * 		1����һ��Ȩ�����η�(���η���private��public��default)
	 * 		2���������γ�Ա�����ͳ�Ա�������������ξֲ�������
	 * 		3���������εĳ�Աֻ���ڱ������
	 */
	/**
	 * ��private ���εı���ֻ���ڱ���ʹ��
	 * this ָ����ǰ�Ķ��󣬼�˭�������ң��Ҿʹ���˭
	 * 
	 * this��Ӧ�ó���
	 * 		�������ֳ�Ա�����;ֲ���������
	 */
	
	private String name;
	private int age;
	
	public void getThis(){
		System.out.println(this);
	}
	/**
	 * �����ṩ�������ʵķ�ʽ
	 * ��������  getXX()��setXX()
	 */
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

}
