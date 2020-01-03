package num3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		//입력을 받고 저장하는 부분
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int max = -1;
		int[] temp = new int[10001];
		for(int i=0; i<size; i++) {
			int x = Integer.parseInt(br.readLine());
			temp[x]++;
			if(max<x) max = x;
			}
		br.close();
		
		for(int i=0; i<=max; i++) {
			while(temp[i]>0) {
				temp[i]--;
				System.out.println(i);
			}
		}
		/*
		Main m = new Main(max, array);
		m.counting_sort();
		m.print();
		*/
	}
	/*
	private int[] array;
	private int max;
	public Main(int max, int[] array) {
		this.max = max;
		this.array = array;
	}
	public void counting_sort() {
		int[] temp = new int[max];
		for(int i=0; i<this.array.length; i++) {
			temp[this.array[i]-1]++;
		}
		int t = 0;
		int[] new_array = new int[this.array.length];
		for(int i=0; i<max; i++) {
			while(temp[i]>0) {
				new_array[t++] = i+1;
				temp[i]--;
			}
		}
		this.array = new_array;
	}
	public void print() {
		for(int i=0; i<this.array.length; i++) {
			System.out.println(array[i]);
		}
	}
	*/
}
