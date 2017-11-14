package com.javaprograms;

public class PyramidNumber {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) { //for rows
			
			
			for (int j = i; j <=5; j++) {
				
				System.out.print(" ");      //for spaces
				
			}
			for (int k = 1; k <=i; k++) { //for number
				
				System.out.print(k+ " ");
				
			}
			System.out.println();
			
		}
		

	}

}
