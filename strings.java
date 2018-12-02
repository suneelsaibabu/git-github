package assignment;

import java.util.HashMap;
import java.util.Map;

public class strings {
	static void Duplicate(String str) {
		Map<String,Integer> map=new HashMap<>();
		String[] s=str.split(" ");
		for(String s1:s) {
			if(map.get(s1)!= null) {
				map.put(s1, map.get(s1)+1);
			}else {
			
			map.put(s1, 1);
		}}
		System.out.println(map);
	}
public static void main(String[] args) {
		Integer i=new Integer("10");
	System.out.println(i);
	Boolean b=new Boolean(true);
	Boolean b1=new Boolean(false);
	Boolean b2=new Boolean("false");
	Boolean b3=new Boolean("true");
	System.out.println(b2.equals(b3));
	
	Float f1=new Float(10.5f);
	Float f2=new Float("10.5f");
Duplicate("I am am learning java java");
	  
}}


