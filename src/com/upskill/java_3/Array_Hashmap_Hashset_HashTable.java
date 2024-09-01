package com.upskill.java_3;

import java.util.HashMap; 
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array store multiple data using index
		
		int age = 30;												//Variable
		
		int[] ageStarLord = new int[]{25, 30, 28, 32, 35, 27};		//Array
		
		//Array index				[0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Age : " + ageStarLord[0]);
		System.out.println("Total Student : " + ageStarLord.length);
		
		String[] nameStarLord = new String[]{"Ahsan", "Arobi", "Elena", "Eshana", "Sani", "Pavel"};
		
		System.out.println("Student Name : " + nameStarLord[2]);
		System.out.println("Total Student Name: " + nameStarLord.length);
		
		//Multi-Dimensional Array
		int [][]ageStarLord2D = {{25, 30, 28, 32, 35, 27},		//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
									{26, 29, 30, 34}};			//[1][0] [1][1] [1][2] [1][3]
		
		
		
		System.out.println("Student Age 2d : " + ageStarLord2D[0][4]);
		

		//Hashmap store multiple data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Ahsan", 25);
		Student.put("Arobi", 21);
		Student.put("Elena", 25);
		Student.put("Eshana", 24);
		Student.put("Sani", 19);
		Student.put("Pavel", 23);
		
		//How to get the value out:
		System.out.println("Hashmap Student Age : " + Student.get("Arobi"));
		
		//String String Hashmap Country, Capital.
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("USA", "Washington D.C.");
		Capital.put("Bangladesh", "Dhaka");
		Capital.put(null, "null key value");
		Capital.put(null, null);
		
		System.out.println("Capital City : " + Capital.get(null));
		
		///HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
	//Region.put(null, "null key value");
	//Region.put(null, null);
		
		System.out.println("Region : " + Region.get("BD"));
		
		///Hashset store unordered collection containing unique value, Implementation of Set Interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
		
		
		
		

		
		
	}
}


