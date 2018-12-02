package assignment;

import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector v=new Vector(10,5);
		System.out.println(v.capacity());
		for(int i=1; i<=10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		v.addElement("a");
		System.out.println(v.capacity());
		System.out.println(v);
		for(Object d:v) {
			System.out.println(d);
		}
	
	}

}
