package com.ajia;

public class TestDemo5 {

	public static void main(String[] args) {
        Person3 per = new  Person3();
       /* per.setName("����");
        per.setAge(12); 
        // ͨ��setter ��ֵ 
        System.out.println(per.info());
        System.out.println(per.getName());
        System.out.println(per.getAge());*/
        Person3 per1 = new  Person3("����");
        System.out.println(per1.info());
        
        Person3 per2 = new  Person3(12);
        System.out.println(per1.info());
        
	}

}
class Person3{
	private String name ;
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

	public Person3(){
		System.out.println("����������ѩ��");
	}
	
	public Person3(String  name){
		System.out.println("����������ѩ��");
		this.name=name;
	}
	
	public Person3(int age){
		System.out.println("����������ѩ��");
		this.age = age;
	}
	
	public Person3(String  name ,int age){
		System.out.println("����������ѩ��");
		this.name= name ;
		this.age=age;
	}
	public  String  info(){
		return "������"+name+"����:"+age;
	}
}
