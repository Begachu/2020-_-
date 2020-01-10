package _1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Main> m = new ArrayList(n);
		for(int i=0; i<n; i++) {
			m.add(new Main(Integer.parseInt(br.readLine())));
		}
		br.close();
		for(int i=0; i<n; i++) {
			m.get(i).fibonacci();
			m.get(i).print();
		}
	}
	private int n;
	private long[] array;
	private long[] save0;
	private long[] save1;
	//private long[] tempSave;
	
	public Main(int n) {
		this.n = n;
		this.array = new long[n+1];
		this.save0 = new long[n+2];
		this.save0[0] = 1;
		this.save1 = new long[n+2];
		this.save1[1] = 1;
		//this.tempSave = new long[2];
	}
	public long fibonacci() {
		return fibonacci(this.n);
	}
	private long fibonacci(int n) {
		if(n<=1) {
			//tempSave[n]++;
			return n;
			}
		if(this.array[n]!=0) {
			/*
			this.tempSave[0] += this.save0[n];
			this.tempSave[1] += this.save1[n];
			*/
			return this.array[n];
		}
		array[n] = fibonacci(n-2)+fibonacci(n-1);
		this.save0[n] = this.save0[n-1]+this.save0[n-2];
		this.save1[n] = this.save1[n-1]+this.save1[n-2];
		/*
		this.save0[n] = this.tempSave[0];
		this.save1[n] = this.tempSave[1];
		this.tempSave[0] = 0;
		this.tempSave[1] = 0;
		*/
		return array[n];
	}
	public void print() {
		System.out.println(this.save0[n]+" "+this.save1[n]);
	}
}
