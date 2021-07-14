package com.day11;

public class Rectangle {
	float l,b,a;
	
	Rectangle(float l,float b){
		this.l = l;
		this.b = b;
		this.a = l*b;
	}
	public float Area() {
        return a;
    }
	
	public static void main(String[] args) {
		
    	Rectangle r = new Rectangle(4,5);
    	System.out.println("Area of Rectangle1: "+ r.Area());
    	Rectangle r1 = new Rectangle(5,8);
    	System.out.println("Area of Rectangle1: "+ r1.Area());
	}
}