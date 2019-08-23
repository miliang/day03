package lainxi;
/**
 * 一个java文件中可以有多个类(class)
 * 但是必须有一个被public修饰，
 * 必须有一个类的类名和java文件名一致(大小写一致)
 * 这个类必须有main方法才能运行程序
 * 
 *
 */
public class Dome_Student {
	static{
		System.out.println("Dome_Student静态代码块");
	}
	public static void main(String[] args) {
		System.out.println("我是main方法");
		
		Student s1 = new Student();
		Student s2 = new Student();
	}
}
class Student{
	static{
		System.out.println("Student 静态代码块");
	}
	{
		System.out.println("Student 构造代码块");
	}
	public Student(){
		System.out.println("Student 构造方法");
	}
	/**
	 * 运行结果
	 * Dome_Student静态代码块
我是main方法
Student 静态代码块
Student 构造代码块
Student 构造方法
Student 构造代码块
Student 构造方法
	 */
}
