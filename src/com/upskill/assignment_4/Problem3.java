package com.upskill.assignment_4;

/* Write a method which return count of duplicate value from a array?*/

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[]{7,2,6,1,4,7,4,5,4,7,7,3,1};
		int temp = 0;
		
		// I chose to do a bubble sort of the array,
		// but you are free to use any method you wish (e.g. Arrays.sort)
		System.out.print("Duplicate values : ");
		for (int i=0; i < numbers.length; ++i){
			for (int j=1; j < (numbers.length - i); ++j){
				if (numbers[j-1] > numbers[j]){
					temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		int numDup = 0, dupCount = 0;
		int previous = -1;
		for (int i=0; i < numbers.length; ++i){
			if (numbers[i] == previous){
				++numDup;
				if (numDup == 1){
					++dupCount;
					if (dupCount == 1){
						System.out.print(numbers[i]);
					}
					else{
						System.out.print(", " + numbers[i]);
					
					}
				}
			}
			else {
				previous = numbers[i];
				numDup = 0;
			}
		}
		System.out.println("\nNumber of duplicate values: " + dupCount);

	}

}
