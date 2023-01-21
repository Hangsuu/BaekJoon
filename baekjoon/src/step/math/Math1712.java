package step.math;

import java.util.Scanner;

public class Math1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		if(c<=b) System.out.println(-1);
		else System.out.println(a/(c-b)+1);
	}
}