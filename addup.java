package assignment;

import java.util.Scanner;

public class addup {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int d=sc.nextInt();	
		System.out.println("enter second number");
		int a=sc.nextInt();
	int x=0; int y=1;
	 int z = x + y;
		for(int i=0; i<=a; i++) {
			for(int n=0; n<=d; n++)
			
			x =y;
			 y=z;
		     z=x+y;
			System.out.println( z);
		}
		
		}
	} 


