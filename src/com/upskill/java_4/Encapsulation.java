package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";		//write & read
	
	private int ssn = 845758954;			//write only
	
	private String username = "elenacalvillo";	//read only
	
	//Setter Method - name
	public void setName(String value){		//set the data, Write
		name = value;
	}
	
	//Getter Method - name
	public String getName(){				//get the data, Read
		return name;
	}
	
	//Setter Method - ssn
	public void setSSN(int value){		//set the data, write
		ssn = value;
	}
	
	//Getter Method - username
	public String getUserName(){			//get the data, Read
		return username;
	}
	
	//dob, dl, address
	
	private String address = "Comstock Street, Hamtramck";		//write & read
	
	private int dob = 845758954;						//write only
	
	private int dl = 79845254;							//read only

	public void setAddress(String value){		//set the data, Write
		Address = value;
	}
	
	public String getAddress(){				//get the data, Read
		return Address;
	}
	public void setdob(int value){		//set the data, write
		dob = value;
	}
	public void setdl(int dl){			//get the data, Read
		dl = value;
	}
	

}
