package com.ust;

public class Car extends Vechile{

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
		Car l=new Car();
		l.brand="BMW";
		l.model="Q5";
		l.noOfWheels=4;
		l.display();
		
	}
	
	

	
}
