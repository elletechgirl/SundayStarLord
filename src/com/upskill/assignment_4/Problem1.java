package com.upskill.assignment_4;

class Encapsulate{
	private String username = "Elena";
	private String password = "princess";
	private String email = "elenacalvillo1@gmail.com";
	private String first_name = "Elena";
	private String last_name = "Calvillo";
	
	void display(){
		System.out.println("Usename: " + username);
		System.out.println("Password: " + password);
		System.out.println("Email: " + email);
		System.out.println("First name " + first_name);
		System.out.println("Last name " + last_name);
	}
}
public class Problem1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulate e = new Encapsulate();
		e.display();

	}

}
