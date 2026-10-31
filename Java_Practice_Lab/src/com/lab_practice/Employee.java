package com.lab_practice;

public class Employee {
	
	static String company="Infosys";
	
	int eid;
	String ename;
	String department;
	int salary;

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		System.out.println("Company_name : "+e1.company);
		System.out.println("Employee_id : "+e1.eid);
		System.out.println("Employee_Name : "+e1.ename);
		System.out.println("Employee_department : "+e1.department);
		System.out.println("Employee_salary : "+e1.salary);
		
		System.out.println( );
		
		e1.eid=1;
		e1.ename="Ravi";
		e1.department="frontend";
		e1.salary=350000;
		
		System.out.println("Company_name : "+e1.company);
		System.out.println("Employee_id : "+e1.eid);
		System.out.println("Employee_Name : "+e1.ename);
		System.out.println("Employee_department : "+e1.department);
		System.out.println("Employee_salary : "+e1.salary);
		
		System.out.println( );
		
		Employee e2=new Employee();
		
		e2.eid=2;
		e2.ename="kavya";
		e2.department="backend";
		e2.salary=500000;
		
		System.out.println("Company_name : "+e2.company);
		System.out.println("Employee_id : "+e2.eid);
		System.out.println("Employee_Name : "+e2.ename);
		System.out.println("Employee_department : "+e2.department);
		System.out.println("Employee_salary : "+e2.salary);
		
		System.out.println( );
		
		
        Employee e3=new Employee();
		
		e3.eid=3;
		e3.ename="ram";
		e3.department="database";
		e3.salary=400000;
		
		company="TCS";
		
		System.out.println("Company_name : "+e3.company);
		System.out.println("Employee_id : "+e3.eid);
		System.out.println("Employee_Name : "+e3.ename);
		System.out.println("Employee_department : "+e3.department);
		System.out.println("Employee_salary : "+e3.salary);
		
		System.out.println( );
		
		

	}

}
