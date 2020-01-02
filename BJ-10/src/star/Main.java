package star;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Main m = new Main(x);
	}
	private int x;
	
	public Main(int x) {
		this.x = x;
		System.out.print(this.starLine(x, 3));
	}
	public String starLine(int x, int y) {	//x는 세로, y는 가로
		String line = "";
		int x1 = this.x/3;
		
		if(x>=x1&&x<x1*2) {
			
		}
		
		if(x>1) return this.starLine(x-1, 3)+"\n"+line;
		return line;
	}
	public String star(int x) {
		if(x==0) return "   ";
		else if(x==1) return "* *";
		else return "***";
	}
}
