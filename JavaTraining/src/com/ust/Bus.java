package com.ust;

public class Bus extends Vechile{

	String brand;
	String model;
	
	public void display()
	   {
		   System.out.println("Brand:"+brand+" model:"+model+" noOfWheels:"+noOfWheels);
			
	   }

	
	
	/**
	 * @param args
	 */
	public static void main(String args[])
	{
		Bus l=new Bus();
		l.brand="AShokLeyLand";
		l.model="3Gen";
		l.noOfWheels=8;
		l.display();
		
	}
	
	

	
}
