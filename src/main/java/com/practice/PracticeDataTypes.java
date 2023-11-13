package com.practice;

public class PracticeDataTypes {
	int x =10;
	int y =5;
	int z;
	
	double a =10.97;
	double b;
	
	boolean c = true;
	boolean d;
	
	String p = "This is string";
	String q;
	
	public void getData() {
		System.out.println(x);//10
		System.out.println(y);//5
		System.out.println(x+y);//15
		System.out.println(z);//default value 0
		
		System.out.println(a);//10.97
		System.out.println(b);//default value 0.0
		
		System.out.println(c);//true
		System.out.println(d);//default value false
		
		System.out.println(p);//This is string
		System.out.println(q);//default value null
	}
	
	public void getLocalVariables() {
		double a = 9.8;
		int b = 7;
		
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		PracticeDataTypes obj = new PracticeDataTypes();
		
		obj.getData();
		
		obj.getLocalVariables();
	}

}
