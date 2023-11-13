package com.practice;

public class PracticeMethods {
	//1. Non-static void method:
	public void nonStaticVoid() {
		System.out.println("This is non-static void method.");
	}
	
	//2. Static void method:
	public static void staticVoid() {
		System.out.println("This is static void method.");
	}
	
	//3. Non-static return(not void) method:
	public String nonStaticReturn() {
		System.out.println("This is non-static return method.");
		return "anything";
	}
	
	//4. Static Return(not void) method:
	public static int staticReturn() {
		System.out.println("This is static return method.");
		return 5;
	}
	
	public static void main(String[] args) {
		//instantiation ==> create an object
		PracticeMethods obj = new PracticeMethods();
		
		obj.nonStaticVoid(); //1.
		staticVoid(); //2.
		obj.nonStaticReturn();//3.
		staticReturn(); //4.
		
	}

}
