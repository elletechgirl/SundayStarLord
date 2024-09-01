package com.upskill.java_5;

public abstract class AbstractClass {

	//Abstract class has both abstract method and regular method
	
	public void car(){
		// TODO Auto-generated method stub
		System.out.println("My car is Toyota");

	}
	
	public abstract void iDoor();
	
	public abstract String iEngine();
	
	public abstract void iSeat();
	
	public abstract int iWheel();
	
	public void myMethod(){
		System.out.println("this is a regular method");	}
	

}
