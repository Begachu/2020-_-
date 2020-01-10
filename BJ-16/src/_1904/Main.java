package _1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	//길이
		br.close();
		Main m = new Main(n);
	}
	private int n;
	//private int result;
	private long[] temp;
	public Main(int n) {
		this.temp = new long[n+1];
		this.n = n;
		if(n>0) this.tile(n);
		//System.out.println(result);
		System.out.println(temp[n]);
	}
	private long tile(int n) {
		/*
		if(n==0) result++;
		else {
			if(n>1) tile(n-2);
			tile(n-1);
		}
		System.out.println("메소드 진입");
		*/
		
		if(temp[n]==0) {
			if(n==0) return 1;
			else if(n>1) temp[n] = (this.tile(n-2)+this.tile(n-1))%15746;
					else temp[n] = this.tile(n-1)%15746;
		}
		return temp[n];
	}
}
