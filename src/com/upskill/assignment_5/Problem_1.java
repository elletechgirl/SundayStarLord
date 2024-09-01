package com.upskill.assignment_5;

public class Problem_1 {
	/*1.	Write a method that returns the largest integer in the list. 
	You can assume that the list has at least one element.*/
	
	public Integer maximum(Integer[] list){
		
		int maximum = list[0];
		for(int i : list){
			if(i > maximum){
				maximum = i;
			}
		}
		return maximum;
	}

}
