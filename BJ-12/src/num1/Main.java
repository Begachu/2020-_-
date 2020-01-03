package num1;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
		//버블정렬
		for(int i=size-1; i>0; i--) {
			for(int j=i-1; j>=0; j--) {
				if(array[j]>array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(array[i]);
		}
		
		sc.close();
	}
}
