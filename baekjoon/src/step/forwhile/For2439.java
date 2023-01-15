package step.forwhile;

import java.util.Scanner;

public class For2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			sb.append("*");
			System.out.println(sb.toString());
		}
		sc.close();
	}
}