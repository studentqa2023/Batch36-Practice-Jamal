package com.practice;

import java.util.Arrays;

public class PracticeArrays {
	int a = 5;
	int[] b = {2, 3, 4, 5};//Single Dimensional Array
	int[] c = {6, 7, 8, 9};//Single Dimensional Array
	int[] d = {10, 11, 12, 13};//Single Dimensional Array
	int[][] e = {{2, 3, 4, 5},{6, 7, 8, 9}};//Multi Dimensional Array
	int[][] f = {b, c};//Multi Dimensional Array
	int[][] g = {b, c, d};//Multi Dimensional Array
	
	public void method() {
		System.out.println(a);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.deepToString(e));
		System.out.println(Arrays.deepToString(f));
		System.out.println(Arrays.deepToString(g));
	}
	
	public static void main(String[] args) {
		PracticeArrays o = new PracticeArrays();
		o.method();
	}

}
