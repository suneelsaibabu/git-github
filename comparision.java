package assignment;


import java.util.Arrays;

public class comparision {
	public static void main(String[] args) {
	int[] test = new int[5];
			test[0]=2;
			test[1]=4;
			test[2]=5;
			test[3]=1;
			test[4]=3;
		
	Arrays.sort(test);
	//for(int z: test)
	//System.out.println(z);
	for (int i = 0; i < test.length - 1; i++) {
	  if (test[i] + 1 != test[i + 1]) {
	    // Not sequential
		  
	  }
	  System.out.println(i);
	}}}

