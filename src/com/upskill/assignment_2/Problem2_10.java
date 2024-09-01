package com.upskill.assignment_2;

import java.util.Scanner;

public class Problem2_10 {
	//Write a Java program to convert temperature from Fahrenheit to Celsius degree.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Degree Fahrenheit: ");
		double a = s.nextInt();
		s.close();
		myMethod(a);
		

	}
	public static void myMethod(double a){
		double fahrenheit = 0;
		double celcius = (fahrenheit - 32) * 5.0 / 9.0;
		
		System.out.println("The Equivalent of celsius is: ");
		System.out.println(celcius);
	}

}
