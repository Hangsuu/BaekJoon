package step.math;

import java.util.Scanner;

public class Math2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		int count = 1;
		int an = 0;
		while(true) {
			if(n<=an+6*count-5) {
				System.out.println(count);
				break;
			}
			an += 6*(count-1);
			count++;
		}
	}
}