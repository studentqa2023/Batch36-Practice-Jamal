package com.practice;

public class Human {
	public void getMoney() {//non-static method
		System.out.println("This is a non-static method.");
	}
	
	public static void getEuro() {
		System.out.println("This is a static method.");
	}
	
	public static void main(String[] args) {
		//if non the method is non-static then ==> instantiation ==> create an object
		//Formula to create an object: class name object name = new class name();
		Human obj = new Human();
		
		//formula to call the object:
		//1. object_name.method_name [if method is non-static]
		obj.getMoney();
		//2. [if method is static]
		getEuro();
	}

}
