package com.ajia;

public class TestDemo6 {
	public static void main(String[] args) {
		// ʵ������ʱ��
		/*
		 * Person4 per = new Person4(); per.setName("����"); per.setAge(12); //
		 * ͨ��setter ��ֵ System.out.println(per.info());
		 * System.out.println(per.getName()); System.out.println(per.getAge());
		 * Person4 per1 = new Person4("����"); System.out.println(per1.info());
		 * 
		 * Person4 per2 = new Person4(12); System.out.println(per1.info());
		 */
		Person4 per3 = new Person4("����", 12);
		System.out.println(per3.info());
	}
}

class Person4 {
	private String name;
	private int age;
	// ...
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
	public Person4(){ 
		System.out.println("����������ѩ��");
    }
	public Person4(String name) {
		this();
		this.name = name;
	}
	public Person4(int age) {
		this();
		this.age = age;
	}
	public Person4(String name, int age) {
		this(name);
		this.age = age;
	}
	public String info() {
		return "������" + name + "����:" + age;
	}
}
