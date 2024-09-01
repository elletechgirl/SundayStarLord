package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 105;
		
		if (age <= 13){									//Condition - I
			System.out.println("You are children");		//Statement - I
			
		}else if(age >13 && age <18){					// Multiple logic in single condition - II
			System.out.println("You are Teenager");		//Statement - II
		
		}else if (age >=60){							//Condition - III	
			if(age < 100){								//Nested if else
			System.out.println("You are senior");		//Statement - with Nested
		}else{
			System.out.println("You are champion");		//Nested Alternative statement
		}
		}else {
			System.out.println("You are adult");		//Alternative statement
		}

	}

}

//Condition - specific condition for a specific task
//1. else
//when? when you dont know range or it is open, then you use
//if else statement. unknown condition is for else. If is for 
//multiple condition. 
//else is the 2nd condition. else if is the 2nd condition. nested- one 
//if else is inside another if else

	

//2. switch case- execute one condition from multiple conditions
 