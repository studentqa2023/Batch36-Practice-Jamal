package com.practice;

import java.util.List;
import java.util.Stack;

public class PracticeArrayList {
	//Interface<WrapperClass> collectionObject = new ClassName<>();
	//ArrayList is a Class => List is an Interface
	
	public List<Integer> getArrayValue() {
		List<Integer> theList = new Stack<>();//upcasting
		//add 2,3,4,4,5 to theList
		//to insert values we use add() method
		theList.add(2);
		theList.add(3);
		theList.add(4);
		theList.add(4);
		theList.add(5);
		theList.add(0,10);
		theList.add(0,89);
		theList.add(1,11);
		theList.add(1,13);
		theList.add(1,15);
		
		
		System.out.println(theList);
		
		return theList;
	}
	
	public static void main(String[] args) {
		PracticeArrayList obj = new PracticeArrayList();
		obj.getArrayValue();
	}

}
