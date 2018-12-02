package assignment;

public class palindrome {
	public static void main(String[] args) {
		int x=532;
		int temp=x;
		int rem=0;
		int rev;	
		while(temp!=0) {
			rev=temp%10;
			rem=rem*10+rev;
			temp=temp/10;
		
		}
		System.out.println(rem);
	}

}
