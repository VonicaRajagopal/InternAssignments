package com.day11;

public class Student1 {
	int row,num;
	String name,addr;
	Student1(String n,int r,int no,String a) {
		this.name=n;
		this.row=r;
		this.num=no;
		this.addr=a;
	}
	public void display() {
		System.out.println(this.name +"\t\t"+ this.row +"\t\t"+ this.num +"\t\t"+ this.addr);
	}
	public static void main(String[] args) {
		
		System.out.println("Name\t\tRoll_no\t\tPhone_no\t\tAddress");
        Student1 s = new Student1("Sam",101,1233214560,"A1-Paris");
        Student1 s1 = new Student1("John",102,1234567890,"A2-Paris");
        s.display();
        s1.display();
	}
}
