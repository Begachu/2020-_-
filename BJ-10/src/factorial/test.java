package factorial;
import java.util.Scanner;

public class test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		test t = new test(x);
	}
	
	public test(int x) {
		System.out.print(factorial(x));
	}
	
	public int factorial(int x) {
		if(x>0)	return factorial(x-1)*x;
		return 1;
	}
}