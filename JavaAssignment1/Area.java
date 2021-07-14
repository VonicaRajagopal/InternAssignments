package com.day11;

import java.util.Scanner;

public class Area {
	int len, bre;
	
	public void setdim(int l,int b) {
		len=l;
		bre=b;
	}
	
    public int getArea() {
        return len * bre;
    }
    
    public static void main(String[] args) {
    	Area rectangle = new Area();
    	Scanner s=new Scanner(System.in);
    	
    	System.out.print("Enter length & breadth: ");
        rectangle.setdim(s.nextInt(), s.nextInt()); 
        
    	System.out.println("Area of rectangle: " + rectangle.getArea());
    	s.close();
    }
}
