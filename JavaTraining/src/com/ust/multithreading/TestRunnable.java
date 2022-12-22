package com.ust.multithreading;

public class TestRunnable {

	public static void main(String[] args) {
		
		A a=new A();
		Thread t1=new Thread(a);
		t1.start();
		B b=new B();
		Thread t2=new Thread(b);
		t2.start();
	}

}
