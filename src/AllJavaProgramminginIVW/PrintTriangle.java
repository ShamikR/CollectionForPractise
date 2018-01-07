package AllJavaProgramminginIVW;

import java.util.Scanner;

public class PrintTriangle {

	
	int i;
	
	public void setI()
	{
		
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		
		i=sc.nextInt();
	}
	
	
	public void printPrism()
	{
	
		for (int j=0;j<i;j++)
			
		{	System.out.println("");
			
		for (int k=0;k<=j;k++)
				 
			 System.out.print("*");
		
		}
		
	System.out.println("");
		
		 for(int m=i;m>0;m--)
		 {
			 {
				 
				  for(int n=m;n>0;n--)
					System.out.print("."); 
			 }
			 System.out.println(""); 
			   
		 }	
		
		
	
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		PrintTriangle p=new PrintTriangle();
		
		p.setI();
		p.printPrism();
		
		
		
		
		
	}

}
