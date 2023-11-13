package com.practice;

public class ForLoops {
	public static void getLoops() {
		//Positive for loops:
		for(int a=1; a<=20; a++) {
			System.out.println(a);
		}
		
		//Negative for loops:
		for(int b=30; b>=5; b--) {
			System.out.println(b);
		}
		
		//Infinite for loops:
		for(int c=40;; c--) {
			System.out.println(c);
			if(c==-10) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		getLoops();
	}

}
