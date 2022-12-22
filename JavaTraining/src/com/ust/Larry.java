package com.ust;

public class Larry extends Vechile {

	
	   String model;
	   String brand;
	   
	   public void display()
	   {
		   System.out.println("Brand:"+brand+" model:"+model+" noOfWheels:"+noOfWheels);
			
	   }
	
	public static void main(String[] args) {
		Larry l=new Larry();
		l.brand="Mahi";
		l.model="w1";
		l.noOfWheels=10;
		l.display();
		

	}

}
