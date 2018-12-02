package assignment;
import java.util.Scanner;

public class greatestNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int i= sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(i>x && i>y) {
			System.out.println(i);
			 
		}else if(x>y){
			System.out.println(x);
			
		}else {
			System.out.println(y);
		}
	}

}
