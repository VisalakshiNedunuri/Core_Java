package com.logical_statements;

import java.util.Scanner;

//Write Program for restaurant  billing system using nested switch...?
public class SwitchCaseInLoop1 {

	public static void main(String[] args) {
		System.out.println("Welcome  to Restaurant ");
		Scanner sc=new Scanner(System.in);
		String yn="";
		double vegCost = 0;
		double nvCost = 0;
		
		do {
			System.out.println("Enter the category:");
			String catg=sc.next();
//			catg=veg or non-veg or desserts or starters or drinks
			switch(catg) {
			case "veg" ->{
				String vyn="";
				
				do {
					System.out.println("Enter the item:");
					String item=sc.next();
					
					switch(item) {
					case "vb"->{
						System.out.println("veg Biryani -500/-");
						double vbCost=500;
						vegCost= vegCost + vbCost;
					}
					case "pb" ->{
						System.out.println("Paneer Biryani - 600/-");
						double pbCost=600;
						vegCost = vegCost + pbCost;
					}
					case "pbm" ->{
						System.out.println("Panner Butter Masala - 250/-");
						double pbmCost=250;
						vegCost= vegCost + pbmCost;
					}
					case "mb" ->{
						System.out.println("Mushroom Biryani - 280/-");
						double mbCost=280;
						vegCost = vegCost + mbCost;
					}
					case "kp" ->{
						System.out.println("Kaju Pulao - 300/-");
						double kpCost = 300;
						vegCost=vegCost + kpCost;
					}
					case "vrf" ->{
						System.out.println("Veg Fried Rice - 200/-");
						double vrfCost= 200;
						vegCost = vegCost + vrfCost;
					}
					default -> System.out.println("This item not available !!");
					}
					
					System.out.println("Do u want to continue with the veg items...?Click Y for yes or N for no");
					vyn=sc.next();
				}while (vyn.equalsIgnoreCase("y"));
				
				System.out.println("Total Veg Cost is :"+vegCost);
			}
			case "non-veg" ->{
				String nvyn = "";
				
				do {
					System.out.println("Enter the item:");
					String  item=sc.next();
					
					switch(item) {
					case "cb" ->{
						System.out.println("Chicken biryani - 650/-");
						double cbCost=650;
						nvCost=nvCost+cbCost;
					}
					case "mb" ->{
						System.out.println("Mutton Biryani - 750/-");
						double mbCost=750;
						nvCost=nvCost+mbCost;
					}
					case "cfr" ->{
						System.out.println("Chicken fried rice - 350/-");
						double cfrCost=350;
						nvCost=nvCost+cfrCost;
					}
					case "c65" ->{
						System.out.println("chicken 65 -400/-");
						double c65Cost=400;
						nvCost=nvCost+c65Cost;
					}
					case "bc" ->{
						System.out.println("Butter Chicken - 450/-");
						double bcCost=450;
						nvCost=nvCost+bcCost;
					}
					default ->System.out.println("Entered item is not available");
					}
					
					System.out.println("Do u want to continue with the nv items...?Click Y for yes or N for no");
					nvyn=sc.next();
				}while(nvyn.equalsIgnoreCase("y"));
				
				System.out.println("Total NV cost is : "+nvCost);
			}
			default->System.out.println("Enter category is not available");
			}
			System.out.println("Do u want to continue with categories click Y for yes or N for no");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		
		System.out.println("Total cost is:"+(vegCost+ nvCost));

	}

}
