package com.lab_practice;

public class King {
	
	int monthly_salary=5000;
	double gst=(monthly_salary*0.03);
	double pf=(monthly_salary*0.02);
	double allowances=(monthly_salary*0.02);
	double total_monthly_deduction=(gst+pf+allowances);
	double monthly_net_salary=(monthly_salary-(gst+pf+allowances));
	double annual_net_salary=(monthly_net_salary*12);
	double monthly_gst_pf_deduction=(gst+pf);
	double yearly_gst_pf_deduction=(monthly_gst_pf_deduction*12);
	

	public static void main(String[] args) {
		King obj=new King();
		obj.display1();

	}
	void display1() {
		System.out.println("Annual Net salary: "+annual_net_salary);
		System.out.println("Monthly Net salary: "+monthly_net_salary);
		System.out.println("Yearly PF AND GST Deduction: "+yearly_gst_pf_deduction);
	}
}

