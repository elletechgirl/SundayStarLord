package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practiceForLoop();
		practiceWhileLoop();
		practiceDoWhileLoop();
		practiceNestedForLoop();

	}
	
	public static void practiceForLoop(){	//For Loop - Do again and again upto upper limit
		int i;								//Initialize the variable
		for(i=1; i <= 10; i++){				//Setting lower limit, Upper limit, Increment or Decrement
			System.out.println("For Loops number = " + i);	//Statement
		}
	}
	
	public static void practiceWhileLoop(){		//While Loop - Do again and again upto condition match
		int i = 1;								//Initialze the variable
		while(i<=10){							//Setting Condition
			System.out.println("While Loops number = " + i);	//Statement
			i++;												//Increment or decrement
		}
	}
	
	public static void practiceDoWhileLoop(){
		int i = 1;
		do{
			System.out.println("Do While Loops number = " + i);	//statement
			i++;												//Increment or Decrement
		}while (i<=10);											//Checking condition
	}
	public static void practiceInfiniteLoop(){		//Infinite Loop - never ending loop
		int i;										//Initialize the variable
		for (i = 1; ; i++){							//Setting No Upper limit
			System.out.println("Infinite Loops number = " + i);	//Statement
		}
	}
	public static void practiceNestedForLoop(){				//Nested Loop - loop inside another loop
		int i;												//Initialize i for loop 1
		int j;
		for (i=1; i<=10; i++){								//Initialize j for loop 2
		for (j=1; j<=10; j++){								//First loop for i
			int multiplicationTable = i * j;				//Second loop for j
			System.out.println(multiplicationTable + " ");	//Statement for loop 2
		}
		System.out.println(" ");							//Statement for loop 1
	}

}
}

//for loop: writting the loop structure
//do while: checks for condition after executing the statement
//infinite: runs for infinite time.
//nested: a loop statement inside another loop statement
