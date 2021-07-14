package com.day11;

public class Employee {
	int year;
	String name,sal,addr;
	Employee(String n,int y,String s,String a) {
		this.name=n;
		this.year=y;
		this.sal=s;
		this.addr=a;
	}
	public void display() {
		System.out.println(this.name +"\t\t"+ this.year +"\t\t\t"+ this.sal +"\t\t"+ this.addr);
	}
	public static void main(String[] args) {
		System.out.println("Name \t\tYear of joining\t\tSalary\t\tAddress");
		Employee e = new Employee("Robert",1994,"8L","64C-Walls Street");
		Employee e1 = new Employee("Sam",2000,"10L","68D-Walls Street");
		Employee e2 = new Employee("John",1999,"15L","26B-Walls Street");
        e.display();
        e1.display();
        e2.display();
	}
}

