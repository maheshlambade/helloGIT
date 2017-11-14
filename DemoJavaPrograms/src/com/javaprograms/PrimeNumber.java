package com.javaprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		
		for (int i = 1; i <=100; i++) { //for Execute loop   must take 2 for loop
			
			boolean flg=true;
			for (int j = 2; j <=i-1; j++) {    //for devidetion
				
				if (i%2==0) {
					
					flg=false;
					break;
					
				}

				
			}
				          
			if (flg==true) {
				
				System.out.println(i);
				System.out.println("\t");
				
			}
			
		}
	

	}

}
