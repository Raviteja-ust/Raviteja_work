package com.ust.employee;

import java.util.Scanner;

public class PanValidationExample {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pan = scanner.next();
        char c[] = pan.toCharArray();
        System.out.println(validatePanNo(c));
    }
    private static String validatePanNo(char[] c) {
        if(c.length!=10){
            return "Invalid";
        }
        for(int i =0;i<10;i++){
            if((i >= 0 && i<=4) && (c[i] < 'A' || c[i] > 'Z')){
                return "Invalid";
            }
            else if((i > 4 && i <=8) && (c[i] < 48 || c[i] > 57)){
                return "Invalid";
            }
            else if(i==9 && (c[i] < 'A' || c[i] > 'Z')){
                return "Invalid";
            }
        }
        return "Valid";
    }

}
