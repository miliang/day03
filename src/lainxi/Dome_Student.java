package lainxi;
/**
 * һ��java�ļ��п����ж����(class)
 * ���Ǳ�����һ����public���Σ�
 * ������һ�����������java�ļ���һ��(��Сдһ��)
 * ����������main�����������г���
 * 
 *
 */
public class Dome_Student {
	static{
		System.out.println("Dome_Student��̬�����");
	}
	public static void main(String[] args) {
		System.out.println("����main����");
		
		Student s1 = new Student();
		Student s2 = new Student();
	}
}
class Student{
	static{
		System.out.println("Student ��̬�����");
	}
	{
		System.out.println("Student ��������");
	}
	public Student(){
		System.out.println("Student ���췽��");
	}
	/**
	 * ���н��
	 * Dome_Student��̬�����
����main����
Student ��̬�����
Student ��������
Student ���췽��
Student ��������
Student ���췽��
	 */
}
