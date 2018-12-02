package assignment;

public class lamdafun extends Thread {
public static void main(String[] args) {
	

	final String resource1="suneel";
	final String resource2="sumanth";
	Thread t1=new Thread() {
		public void run() {
			synchronized(resource1)
			{
				System.out.println("hi");
				try {
					Thread.sleep(1000);
					}catch(Exception e) 
				{
						
				}
				synchronized(resource2) {
					System.out.println("hi");
				}
			}
			
		}
	};

	Thread t2=new Thread() {
		public void run() {
			synchronized(resource2) {
				System.out.println("threas in sleep");
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					
				}
				synchronized(resource1) {
					System.out.println("happy");
				}
			}
		}
	};
	t1.start();
	t2.start();
}}
