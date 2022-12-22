package com.ust.multithreading;

public class TestMultithread {

	public static void main(String[] args) {
		
		A a=new A();
		a.start();
		B b=new B();
		b.start();
	}

}
