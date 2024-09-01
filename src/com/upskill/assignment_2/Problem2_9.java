package com.upskill.assignment_2;

public class Problem2_9 {
//Write a program to swap two string variables (Talen, Tech) and display 
	//result on the screen
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod();

	}
	public static void myMethod(){
		String a = "Talen";
		String b = "Tech";
		
		String swap = a;
		a = b;
		b = swap;
		
		System.out.println("Swap value a: "+a);
		System.out.println("Swap Value b: "+b);
	}

}
