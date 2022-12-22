package com.ust.multithreading;

public class A extends Thread{
	
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Hello Ravi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}
