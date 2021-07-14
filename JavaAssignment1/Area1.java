package com.day11;

import java.util.Scanner;

public class Area1 {
	float length, breadth, area;
	
	Area1(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
	
	public float returnArea() {
		calculateArea();
        return this.area;
    }
	
	public static void main(String[] args) {
		
    	Scanner s = new Scanner(System.in);
    	
    	System.out.print("Enter length & breadth: ");
    	Area1 rectangle = new Area1(s.nextFloat(),
    								s.nextFloat());
    	
    	System.out.println("Area of rectangle: " + rectangle.returnArea());
    	s.close();
	}
}
