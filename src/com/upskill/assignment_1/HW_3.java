package com.upskill.assignment_1;

public class HW_3 {
	//A function which returns the multiply value of a and b where a = 9 and b = 11.
	//Write a program which will display addition of a + b + function returns value.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 9;
		int b = 11;
		int multiplicationValue = multiplyFunction(a,b);
		
		System.out.println("The Result is : " + (a+b+multiplicationValue));
	}
		
		public static int multiplyFunction(int a, int b){
			return a*b;
		}

	}


