package com.day11;

public class Triangle {
		double l,b,h,a,p;
		
		Triangle() {
			l=3;
	        b=4;
	        h=5;
			a=(double)(b*h)/2;
			p=(double)l*b*h;
	    }
		
	    public static void main(String[] args) {
	    	
	    	Triangle t = new Triangle();
	    	System.out.println("Area of triangle: "+t.a);
	    	System.out.println("Perimeter of triangle: "+t.p);
	    }
}
