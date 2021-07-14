package com.day11;

public class Complex {
	double real, imaginary;
	
	Complex() {
		this.real = 0;
		this.imaginary = 0;
	}
	
	Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public void complexDisplay() {
		if(imaginary < 0)
			System.out.println(this.real + " - i" + (-1 * this.imaginary));
		else
			System.out.println(this.real + " + i" + this.imaginary);
	}
	
	public static Complex complexAddition(Complex num1, Complex num2) {
        
		Complex sum = new Complex(0, 0);
		sum.real = num1.real + num2.real;
		sum.imaginary = num1.imaginary + num2.imaginary;
        
        return sum;       
    }
	
	public static Complex complexSubtraction(Complex num1, Complex num2) {

		Complex diff = new Complex(0, 0);
		diff.real = num1.real - num2.real;
		diff.imaginary = num1.imaginary - num2.imaginary;
        
        return diff; 
    }
	
	public static Complex complexMultiplication(Complex num1, Complex num2) {

		Complex product = new Complex(0, 0);
		product.real = (num1.real * num2.real) - (num1.imaginary * num2.imaginary);
		product.imaginary = (num1.real * num2.imaginary) + (num2.real * num1.imaginary);
		
		return product;
		
	}
	
	public static void main(String args[]) {
		
		Complex num1 = new Complex(5, 3);
		Complex num2 = new Complex(6, 7);
		
		Complex sum = complexAddition(num1, num2);
		sum.complexDisplay();
		
		Complex diff = complexSubtraction(num1, num2);
		diff.complexDisplay();
		
		Complex product = complexMultiplication(num1, num2);
		product.complexDisplay();
	}
}
