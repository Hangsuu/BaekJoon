package step.forwhile;

import java.util.Scanner;

public class For2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int n = sc.nextInt();
		String s = " ";
		for(int i=0; i<n; i++) {
			sb.append("*");
			String sp = s.repeat(n-i-1);
			System.out.print(sp);
			System.out.println(sb.toString());
		}
		sc.close();
	}
}