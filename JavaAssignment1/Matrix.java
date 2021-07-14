package com.day11;

public class Matrix {
	int matrixRow, matrixCol;
	int[][] arr;
	Matrix(int row, int col){
		arr = new int[row][col];
		matrixRow = row;
		matrixCol = col;
	}
	
	public int getRow() {
		return matrixRow;
	}
	
	public int getColumn() {
		return matrixCol;
	}
	
	public void setMatrix(int i,int j, int val) {
		arr[i][j] = val;
	}
	
	public static void addMatrix(Matrix m1, Matrix m2, Matrix result) {
		
		if(m1.matrixRow != m2.matrixRow || m1.matrixCol != m2.matrixCol) {
			System.out.println("Matrices cannot be added.");
		} else {			
			for(int i=0; i<m1.matrixRow; i++) {
				for(int j=0; j<m2.matrixCol; j++) {
					result.arr[i][j] = m1.arr[i][j] + m2.arr[i][j];
				}
			}
		}
	}
	
	public static void MatrixMultiplication(Matrix m1, Matrix m2, Matrix result) {
		
		if(m1.matrixRow != m2.matrixCol || m1.matrixCol != m2.matrixRow ) {
			System.out.println("Matrices cannot be multiplied.");
		} else {			
			for(int i=0; i<m1.matrixRow; i++) {
				for(int j=0; j<m2.matrixCol; j++) {
					result.arr[i][j] = 0;
					for(int k=0; k<m1.matrixRow; k++) {
						result.arr[i][j] += m1.arr[i][k] + m2.arr[k][j];
					}
				}
			}
		}
	}
	
	public void display() {
		for(int i=0; i<matrixRow; i++) {
			for(int j=0; j<matrixCol; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	public static void main(String args[]) {
		
    	Matrix m1 = new Matrix(2, 2);
    	Matrix m2 = new Matrix(2, 2);
    	
    	for(int i=0; i<2; i++) {
    		for(int j=0; j<2; j++) {
    			m1.setMatrix(i, j, (int)(Math.random()*10));
    			m2.setMatrix(i, j, (int)(Math.random()*10));
    		}
    	}
    	
    	Matrix result1 = new Matrix(m1.matrixRow, m1.matrixCol);
    	Matrix result2 = new Matrix(m1.matrixRow, m2.matrixCol);
    	addMatrix(m1, m2, result1);
    	MatrixMultiplication(m1, m2, result2);
    	
    	m1.display();
    	m2.display();
    	result1.display();
    	result2.display();
	}
}
