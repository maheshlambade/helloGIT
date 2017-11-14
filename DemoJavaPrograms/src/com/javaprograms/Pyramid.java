package com.javaprograms;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <=5; i++) {   //for rows
			
			
			
			for (int j = i; j <=5; j++) {
				
				                         // for spaces
				
				System.out.print(" ");
				
			}
			for (int k = 1; k <=i; k++) {
				
				System.out.print("* "); //for print star
			}
			System.out.println();
		}
	}

}
