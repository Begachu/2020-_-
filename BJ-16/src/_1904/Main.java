package _1904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	//±Ê¿Ã
		br.close();
		
		int[] save = new int[n+1];
		
		save[0] = 1;
		save[1] = 2;
		for(int i = 2; i<n; i++) {
			save[i] = (save[i-1]+save[i-2])%15746;
		}
		System.out.println(save[n-1]);
	}
}
 