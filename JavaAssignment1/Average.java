package com.day11;

import java.util.Scanner;

public class Average {
    public static void printAverage(float a, float b, float c) {
        System.out.println("Average of given value: " + (a + b + c) / 3);
    }    
    
    public static void main(String[] args) {

    	Scanner s = new Scanner(System.in);
    	
    	System.out.print("Enter three values: ");
    	printAverage(s.nextFloat(),
    			s.nextFloat(),
    			s.nextFloat());
    	
    	s.close();
    }
}
