package assignment;

import java.util.Scanner;

public class findLargest {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number");
	double largest=sc.nextDouble();
	while(sc.hasNextDouble()) {
		
		double input=sc.nextDouble();
		if(input > largest) {
			largest = input;
		}
		
	}
	System.out.println(largest);
}
}
