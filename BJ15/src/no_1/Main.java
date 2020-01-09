package no_1;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Main { 
  public static void main(String[] args) throws NumberFormatException, IOException { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    int n = Integer.parseInt(br.readLine());
    int l = Integer.parseInt(br.readLine());
    br.close();
    
    int[][] temp = new int[n][l];
    int end = 0;
    int temp_l = 0;
    while(end==0) {
    }
    /*
     * int[] array = new int[l];
    Stack<Integer> s = new Stack();
    for(int i=n; i>0; i--) {
    	s.push(0);
    	s.push(i);
    }
    System.out.println(s);
    
    while(!s.isEmpty()) {
    	int i = s.pop();
    	int size = s.pop();
    	array[size] = i;
    	if(size==l-1) {
    		for(int j=0; j<l; j++) {
    			System.out.print(array[j]+" ");
    		}
    		System.out.println();
    		continue;
    	}
    	for(int j=0; j<n; j++) {
    		if(array.)
    	}
    	
    }
    */
  }
}
