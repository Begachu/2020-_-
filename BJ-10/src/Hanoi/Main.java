package Hanoi;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Main m = new Main(x);
	}
	
	public Main(int x) {
		this.hanoi(x, 2, 0);
	}
	private void hanoi(int x, int t, int f) {	//x:��, t:����, f:����
		if(x!=0) {
		int temp = t+f==1?2:(t+f==2?1:0);
		this.hanoi(x-1, temp, f);
		System.out.println(x+"��° : "+(f+1)+" "+(t+1));
		this.hanoi(x-1, t, temp);
		}
	}
	
}
