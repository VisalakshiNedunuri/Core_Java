package com.java_methods;


class Studentd{
	int sid;
	String sname;
	int age;
}
public class FactoryMethod {
	
	Studentd getStudent() {
		Studentd s1=new Studentd();
		s1.sid=10001;
		s1.sname="abc";
		s1.age=20;
		return s1;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		FactoryMethod f=new FactoryMethod();
		
		Studentd s=f.getStudent();
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.age);
		
		f.sendStudentData(s);
		System.out.println("main method ended");
	}
	void sendStudentData(Studentd st) {
		System.out.println("Student Data received");
		System.out.println(st.sid);
		System.out.println(st.sname);
		System.out.println(st.age);
	}

}
