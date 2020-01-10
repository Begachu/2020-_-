package _2748;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Main m = new Main(n);
		br.close();
		System.out.println(m.fibonacci(n));
	}
	private int n;
	private long[] array;
	public Main(int n) {
		this.n = n;
		this.array = new long[n+1];
	}
	public long fibonacci(int n) {
		if(n<=1) return n;
		if(this.array[n]!=0) return this.array[n];
		array[n] = fibonacci(n-2)+fibonacci(n-1);
		return array[n];
	}
}
