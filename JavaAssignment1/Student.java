package com.day11;

public class Student {
	String name;
    int roll_no;
    
    public void print() {
        System.out.println(name);
        System.out.println(roll_no);
    }    
    
    public static void main(String[] args) {
    	
        Student stud = new Student();
        stud.name = "John";
        stud.roll_no = 2;
        
        stud.print();
    }
}
