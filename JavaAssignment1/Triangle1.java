package com.day11;

public class Triangle1 {
	double a,p;
	Triangle1(double l,double b,double h) {
        a=(double)(b*h)*0.5;
        p=(double)l*b*h;
    }
    public static void main(String[] args) {
    	
    	Triangle1 t = new Triangle1(3.0, 4.0, 5.0);
    	System.out.println("Area of triangle: "+ t.a);
    	System.out.println("Perimeter of triangle: "+ t.p);
    }
}
