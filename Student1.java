package assignment;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Student1 {
	static int count=0;
	public static void main(String[] args) {
	/*	//create pattern object from java.util.regex;
		Pattern p=Pattern.compile("\\S");
		//create matcher object from java.util.regex;
		String[] m=p.split("wwwd urgajobs com");
		for(String p1: m) {
		//this will return the number of matched values are in the list
			count++;
			// this will return the index values of the String.
			System.out.println(p1);
		}
		//print the total number of repeated values.
		System.out.println("The number of repeated values in patternare are:" +count );*/
    Pattern p=Pattern.compile("\\s");
    String[] s1=p.split("Durga software solutions");
    for(String s2: s1) {
    	System.out.println(s2);
  }
	}
	}