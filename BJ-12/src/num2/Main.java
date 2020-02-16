package num2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		//입력을 받고 저장하는 부분
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] array = new int[size];
		for(int i=0; i<size; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		Main m = new Main(array);
		//알고리즘 부분
		//m.merge_sort();
		m.quick_sort();
		
		//출력하는 부분
		m.print();
	}
	int[] array;
	
	public Main(int[] array) {
		this.array = array;
	}
	public void quick_sort() {
		if(this.array.length>0) {
			int p = this.partition(0, this.array.length);
			this.quick_sort(0, p);
			this.quick_sort(p, this.array.length);
		}
	}
	private void quick_sort(int start, int end) {
		if(end>start+1) {
			int p = this.partition(start, end);
			this.quick_sort(start, p);
			this.quick_sort(p, end);
		}
	}
	private int partition(int start, int end) {
		int num = start;
		int x = this.array[end-1];
		for(int i=start; i<end-1; i++) {
			if(this.array[i]<x) {
				int temp = this.array[i];
				this.array[i] = this.array[num];
				this.array[num++] = temp;
			}
		}
		this.array[end-1] = this.array[num];
		this.array[num] = x;
		return num;
	}
	
	public void merge_sort() {
		if(this.array.length>2) {
			merge_sort(0, this.array.length/2);
			merge_sort(this.array.length/2, this.array.length);
			combine(0, this.array.length/2, this.array.length);
		}
	}
	private void merge_sort(int start, int end) {
		if(end-start>1) {
			merge_sort(0, (end+start)/2);
			merge_sort((end+start)/2, end);
			combine(start, (end+start)/2, end);
		}
	}
	private void combine(int start1, int start2, int end) {
		int x1 = start1;
		int x2 = start2;
		int[] temp_array = new int[end-start1];
		for(int i=0; i<end-start1; i++) {
			if(x1<start2&&(x2>=end||this.array[x1]<this.array[x2])) {
				temp_array[i] = this.array[x1++];
			}else {
				temp_array[i] = this.array[x2++];
			}
		}
		for(int i=start1; i<end; i++) {
			this.array[i] = temp_array[i-start1];
		}
	}
	
	public void print() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<this.array.length; i++) {
			sb.append(array[i]+"\n");
		}
		System.out.print(sb);
	}
}
