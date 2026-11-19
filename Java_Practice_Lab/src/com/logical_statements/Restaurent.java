package com.logical_statements;

import java.util.Scanner;

//Write Program for restaurant  billing system using nested switch...?
public class Restaurent{

	public static void main(String[] args) {
		System.out.println("Welcome  to Restaurant ");
		Scanner sc=new Scanner(System.in);
		String yn="";
		double vegCost = 0;
		double nvCost = 0;
		double desCost= 0;
		double vstsCost= 0;
		double nvstsCost =0;
		double dCost=0;
		
		do {
			System.out.println("Enter the category:");
			String catg=sc.next();
			
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
			case "desserts" ->{
				String desyn = "";
				
				do {
					System.out.println("Enter the item:");
					String  item=sc.next();
					
					switch(item) {
					case "clc" ->{
						System.out.println("Choco Lava Cake - 150/-");
						double clcCost=150;
						desCost=desCost+clcCost;
					}
					case "rvc" ->{
						System.out.println("Red Velvet Cake - 150/-");
						double rvcCost=150;
						desCost=desCost+rvcCost;
					}
					case "cb" ->{
						System.out.println("Chocolate Brownie - 120/-");
						double cbCost=120;
						desCost=desCost+cbCost;
					}
					case "gj" ->{
						System.out.println("Gulab Jamun - 100/-");
						double gjCost=100;
						desCost=desCost+gjCost;
					}
					case "tm" ->{
						System.out.println("Tiramisu - 300/-");
						double tmCost=300;
						desCost=desCost+tmCost;
					}
					case "fl" ->{
						System.out.println("Falooda - 200/-");
						double flCost=200;
						desCost=desCost+flCost;
					}
					default ->System.out.println("Entered item is not available");
					}
					
					System.out.println("Do u want to continue with the dessert items...?Click Y for yes or N for no");
					desyn=sc.next();
				}while(desyn.equalsIgnoreCase("y"));
				
				System.out.println("Total Desserts cost is : "+desCost);
			}
			case "veg-starters" ->{
				String vstsyn = "";
				
				do {
					System.out.println("Enter the item:");
					String  item=sc.next();
					
					switch(item) {
					case "gbm" ->{
						System.out.println("Gobi Manchurian - 200/-");
						double gbmCost=200;
						vstsCost=vstsCost+gbmCost;
					}
					case "pt" ->{
						System.out.println("Paneer Tikka - 320/-");
						double ptCost=320;
						vstsCost=vstsCost+ptCost;
					}
					case "cc" ->{
						System.out.println("Crispy Corn - 230/-");
						double ccCost=230;
						vstsCost=vstsCost+ccCost;
					}
					case "vsk" ->{
						System.out.println("Veg Sheek Kabab - 250/-");
						double vskCost=250;
						vstsCost=vstsCost+vskCost;
					}
					case "tm" ->{
						System.out.println("Tandoori Mushroom - 350/-");
						double tmCost=350;
						vstsCost=vstsCost+tmCost;
					}
					
					default ->System.out.println("Entered item is not available");
					}
					
					System.out.println("Do u want to continue with the veg-starter items...?Click Y for yes or N for no");
					vstsyn=sc.next();
				}while(vstsyn.equalsIgnoreCase("y"));
				
				System.out.println("Total Desserts cost is : "+vstsCost);
			}
			case "non-veg-starters" ->{
				String nvstsyn = "";
				
				do {
					System.out.println("Enter the item:");
					String  item=sc.next();
					
					switch(item) {
					case "ct" ->{
						System.out.println("Chicken Tikka - 350/-");
						double ctCost=350;
						nvstsCost=nvstsCost+ctCost;
					}
					case "cl" ->{
						System.out.println("Chicken Lollipop - 350/-");
						double clCost=350;
						nvstsCost=nvstsCost+clCost;
					}
					case "ap" ->{
						System.out.println("Appola Fish - 200/-");
						double apCost=200;
						nvstsCost=nvstsCost+apCost;
					}
					case "tc" ->{
						System.out.println("Tandoori Chicken - 400/-");
						double tcCost=400;
						nvstsCost=nvstsCost+tcCost;
					}
					case "cm" ->{
						System.out.println("Chicken Manchurian - 150/-");
						double cmCost=150;
						nvstsCost=nvstsCost+cmCost;
					}
					
					default ->System.out.println("Entered item is not available");
					}
					
					System.out.println("Do u want to continue with the Non-veg-starter items...?Click Y for yes or N for no");
					nvstsyn=sc.next();
				}while(nvstsyn.equalsIgnoreCase("y"));
				
				System.out.println("Total Desserts cost is : "+nvstsCost);
			}
			case "drinks" ->{
				String dyn = "";
				
				do {
					System.out.println("Enter the item:");
					String  item=sc.next();
					
					switch(item) {
					case "cc" ->{
						System.out.println("Coco cola - 70/-");
						double ccCost=70;
						dCost=dCost+ccCost;
					}
					case "pep" ->{
						System.out.println("Pepsi - 50/-");
						double pepCost=50;
						dCost=dCost+pepCost;
					}
					case "thm" ->{
						System.out.println("Thums up- 80/-");
						double thmCost=80;
						dCost=dCost+thmCost;
					}
					case "sp" ->{
						System.out.println("Sprite - 50/-");
						double spCost=50;
						dCost=dCost+spCost;
					}
					case "mj" ->{
						System.out.println("Maja - 50/-");
						double mjCost=50;
						dCost=dCost+mjCost;
					}
					case "fnt" ->{
						System.out.println("Fanta - 50/-");
						double fntCost=50;
						dCost=dCost+fntCost;
					}
					case "lim" ->{
						System.out.println("Limca  - 40/-");
						double limCost=40;
						dCost=dCost+limCost;
					}
					
					default ->System.out.println("Entered item is not available");
					}
					
					System.out.println("Do u want to continue with the drinks...?Click Y for yes or N for no");
					dyn=sc.next();
				}while(dyn.equalsIgnoreCase("y"));
				
				System.out.println("Total Desserts cost is : "+dCost);
			}
			
			default->System.out.println("Enter category is not available");
			}
			System.out.println("Do u want to continue with categories click Y for yes or N for no");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		
		System.out.println("Total cost is:"+(vegCost+ nvCost));

	}

}