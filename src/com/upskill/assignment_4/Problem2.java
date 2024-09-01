package com.upskill.assignment_4;
/*Write a method which will reverse a string*/



public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString("Elena");

	}
	
	public static void reverseString(String input){
		
		//getBytes() method to convert string
		//into bytes[]
		byte [] strAsByteArray = input.getBytes();
		
		byte [] result = new byte [strAsByteArray.length];
		
		//Store result into reverse order into the 
		// result byte[]
		
		for (int i = 0; i<strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length-i-1];
		System.out.println(new String(result));
	}

}
