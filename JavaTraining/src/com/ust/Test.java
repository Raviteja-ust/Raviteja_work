package com.ust;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	private static Scanner scn;
	private static  boolean x;
	
	public static void main(String[] args) {
		if(x) {
			System.out.println("m");
		};
		scn= new Scanner(System.in);
		int i = scn.nextInt();
		if(i==0) {
			System.out.println("a");
		}else if(i<100 && i>10) {
			System.out.println("b");
		}else if(i<1000 && i>100) {
			System.out.println("c");
		}else if(i<10000 && i>1000) {
			System.out.println("d");
		}else {
			System.out.println("x");
		}
		
}
}


