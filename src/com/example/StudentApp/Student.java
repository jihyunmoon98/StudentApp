package com.example.StudentApp;

public class Student implements Comparable<Student>{
	private int no; //number
	private String name; //name
	private int age; //age
	
	public Student (int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

	public int getNo() {
		return no;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	public void setNo(int no) {
		this.no = no;
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
	
	
}
