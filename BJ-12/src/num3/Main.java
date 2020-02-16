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
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<=max; i++) {
			while(temp[i]>0) {
				temp[i]--;
				sb.append(i+"\n");
			}
		}
		System.out.print(sb);
	}
}
