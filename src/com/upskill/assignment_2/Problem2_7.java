package com.upskill.assignment_2;

public class Problem2_7 {
	//You are given two integer number (a=25, b=30),  
	//write a program to swap them and display result on the screen.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod();

	}
	public static void myMethod(){
		int a = 25;
		int b = 30;
		int temp;
		temp =  a;
		a = b;
		b = temp;
		
		System.out.println("Swap value a:" + a);
		System.out.println("Swap value b:" + b);
	}

}
