package com.day11;

import java.util.Scanner;

public class Employee1 {
	int s,w;
	
	public void getInfo(int sal,int wpd) {
		s=sal;
		w=wpd;
	}
	
	public void AddSal() {
		if(s<500) s+=10;	
	}
	
	public void AddWork() {
		if(w>6) s+=5;
	}
	
	public static void main(String[] args) {
	Employee1 e = new Employee1();
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter salary & working hours: ");
	e.getInfo(sc.nextInt(), sc.nextInt());
	
	e.AddSal();
	e.AddWork();
	System.out.println("Salary: "+ e.s);
	
	sc.close();
	}
}
