package com.ajia;

// this.����()  ֻ���ǵ�ǰ���еķ��� 
// this.���췽��()
public class TestDemo4 {
	public static void main(String[] args) {
		Person2 per = new Person2("����",12);
		System.out.println(per.info()); // *********
		// ����������������:23
 
	}
}

class Person2{
	// �����е��÷��� ��ֱ���÷�������
	private String  name;
	private int age;
	
	public Person2(String  name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void print(){
		System.out.println("*************");
	}
	
	public String info(){
		this.print();
		return "������"+name+",���䣺"+age;
	}
}



