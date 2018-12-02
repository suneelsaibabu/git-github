package assignment;
import java.util.Scanner;

public class luckyNumber 
{

public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
      int x= sc.nextInt();
  
      
      do {
    	  int sum=0;
    	  while(x>0) {
    		 int temp= x%10;
    		  sum += temp;
    		  x= x/10;
    		  
    	  }
    	  x=sum;
    	  }
    	  while(x>=10);
    	  {
    		  System.out.println("luck number is " +x);
    	  }
    	  sc.close();
      
}
}

