package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass{
	
	@Override
	public void iDoor(){
		System.out.println("My car 4 door");
	}
	
	@Override
	public String iEngine(){
		return "8ph";
	}
	
	@Override 
	public int iWheel(){
		return 4;
	}
	
	@Override
	public void iMyMethod(){
		System.out.println("review class abstract method");
	
	}
	
	@Override
	public void iReviewClass(){
		System.out.println("review class abstract method");
	}

}
