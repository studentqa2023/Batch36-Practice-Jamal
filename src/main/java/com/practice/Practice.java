package com.practice;

public class Practice {
	public static void getCondition(int age) {
		if(age>=18) {
			System.out.println("You're an adult.");
		}
		else {
			System.out.println("You're a minor.");
		}
	}
	
	public static void getCondition(String name) {
		if(name.contains("Rez")) {
			System.out.println("Match found.");
		}
		else {
			System.out.println("Match not found.");
		}
	}
	public static void getCondition2(String name) {
		if(name.contentEquals("Ahmed Khan")) {
			System.out.println("Match found.");
		}
		else {
			System.out.println("Oops, There's something wrong.");
		}
	}
	
	public static void getCondition2(int year) {
		if(year>=1901 && year<=1927) {
			System.out.println("The Greatest Generation");
		}
		else if(year>=1928 && year<=1945) {
			System.out.println("The Silent Generation");
		}
		else if(year>=1946 && year<=1964) {
			System.out.println("The Baby Boomer Generation");
		}
		else {
			System.out.println("Generation not found.");
		}
	}
	
	public static void getLoops() {
		for(int a=0; a<=10; a++) {
			System.out.println(a);
		}
		for(int b=40; b>=11; b--) {
			System.out.println(b);
		}
		for(int c=25;; c--) {
			System.out.println(c);
			if(c==-9) {
				break;
			}
		}
	}
	
	//How to reverse any country's name?
	//1st way: By using Negative For Loop
	public static void getReverse(String countryName) {
		for(int i=(countryName.length()-1); i>=0; i--) {
			System.out.print(countryName.charAt(i));
		}
	}
	
	public static void getReverseWithStringBuilder(String countryName) {
		StringBuilder sb = new StringBuilder(countryName);
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {
		getCondition(9);
		
		getCondition("Rezwan Ahmed");
		getCondition("Redwan Ahmed");
		
		getCondition2("Ahmed Shah");
		getCondition2("Ahmed");
		getCondition2("Ahmed Khan");
		
		getCondition2(1971);
		getCondition2(1928);
		
		getLoops();
		
		getReverse("Nepal");
		getReverse("Bangladesh");
		
		getReverseWithStringBuilder("India");
		getReverseWithStringBuilder("China");
	}

}
