package Hanoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		System.out.println((1<<x)-1);
		Main m = new Main(x);
		System.out.println(sb);
	}
	
	public Main(int x) {
		this.hanoi(x, 2, 0);
	}
	private void hanoi(int x, int t, int f) {	//x:Ãþ, t:µµÂø, f:½ÃÀÛ
		if(x!=0) {
		int temp = t+f==1?2:(t+f==2?1:0);
		this.hanoi(x-1, temp, f);
		sb.append((f+1)+" "+(t+1)+"\n");
		this.hanoi(x-1, t, temp);
		}
	}
	
}
