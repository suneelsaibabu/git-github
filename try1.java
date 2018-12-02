package assignment;

import java.util.Random;

  public class try1 {
	public static void main(String[] args) {
		  myRunnable r=new myRunnable();
    Thread t1=new Thread(); 
	 t1.start();
	 
	for(int i=0; i<=5;i++) {
		System.out.println("main method");
	}
	}
}
class myRunnable implements Runnable
{
	synchronized public void run()
	{
		for(int i=0; i<=10; i++) {
			System.out.println("hello world");
		}
	}
}