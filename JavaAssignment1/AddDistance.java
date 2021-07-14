package com.day11;

import java.util.Scanner;
public class AddDistance {
	double val,f;
	public double display(double d,double d1) {
		val=d + d1;
		f=val/12;
        return f;
    }
	public static void main(String[] args) {
    	AddDistance d = new AddDistance();
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter two distances (in inch): ");
    	System.out.println("Value in feet: "+d.display(s.nextDouble(),s.nextDouble()));
    	s.close();
	}
}