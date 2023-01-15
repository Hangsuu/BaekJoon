package step.forwhile;

import java.util.Scanner;

public class For1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(!(n>=0 && n<100)) n = sc.nextInt();
		sc.close();
		int fixNum = n;
		int count = 0;
		while(true) {
			count++;
			int ten = fixNum/10;
			int one = fixNum%10;
			int sum = ten + one;
			fixNum = 10*one + sum%10;
			if(fixNum==n)break;
		}
		System.out.println(count);
	}
}