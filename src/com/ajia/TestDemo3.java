package com.ajia;

// this.����
// ctrl + d �h��һ��  �ڴ��� 
public class TestDemo3 {
	public static void main(String[] args) {
		Person1 per = new Person1("����",23);
		System.out.println(per.infos());
        //  System.out.println ������
	}
}
// ��java�����治Ҫ����� 
class Person1 {
	// ���� ��װ��
	private String name; // private ˽�е� public ���е� ���η�
	private int age;
	
	

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
	
	public Person1(String  name ,int age){
		this.name=name;
		this.age=age;
	}
	// ���������ǿ����Զ�
	public String  infos() {
        return "������"+name+"������:"+age; // 1.0
	}
}