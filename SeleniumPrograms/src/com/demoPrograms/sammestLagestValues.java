package com.demoPrograms;

public class sammestLagestValues {

	public static void main(String[] args)
	{
	  // this is git
		int num[] =new int[]{12,15,22,66,55,89,99};
		int largest=num[0];
		int smallest=num[0];
		
		for (int i = 0; i <num.length; i++) 
		{
		if (num[i]>largest) 
		{
		largest=num[i];
		
		}else
			if (num[i]<smallest) 
			{
			smallest=num[i];	
			}
		}
		System.out.println("largest num :"+largest);
		System.out.println("Smallest num :"+smallest);  
	}

}
