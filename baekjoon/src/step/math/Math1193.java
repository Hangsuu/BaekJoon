package step.math;

import java.util.Scanner;

public class Math1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int count = 1;
		while(true) {
			if(n<=count) {
				if(count%2==0) System.out.println(n+"/"+(count+1-n));
				else System.out.println((count+1-n)+"/"+n);
				break;
			}
			n -= count;
			count++;
		}
	}
}