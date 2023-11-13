package com.practice;

public class Reverse {
	//How to print a name in reverse?
	//There's two way to do it-
	//First way: by using NEGATIVE FOR LOOP:
	
	public static void getReverse(String name) {
		for(int i=(name.length()-1); i>=0; i--) {
			System.out.println(name.charAt(i));
		}
	}
	
	//Second way: by using STRING BUILDER OR STRING BUFFER:
	public static void reverseWithStringBuilder(String myName) {
		StringBuilder sb = new StringBuilder(myName);
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {
		getReverse("Leonel Messi");
		
		reverseWithStringBuilder("Cristiano Ronaldo");
	}

}
