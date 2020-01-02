package fibonacci;

import java.util.Scanner;

public class test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		test t = new test(x);
	}
	
	int[] array;
	public test(int x) {
		this.array = new int[x+2];
		this.array[0] = 0;
		this.array[1] = 1;
		System.out.print(this.fibonacci(x));
	}
	
	public int fibonacci(int x) {
		if(x<=1) return this.array[x];
		if(this.array[x-2]==0) {
			this.array[x-2] = this.fibonacci(x-2);
		}
		if(this.array[x-1]==0) {
			this.array[x-1] = this.fibonacci(x-1);
		}
		return this.array[x-1]+this.array[x-2];
	}
}
