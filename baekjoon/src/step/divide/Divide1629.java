package step.divide;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Divide1629 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long a = sc.nextLong();
		long n = sc.nextLong();
		long c = sc.nextLong();
		
		bw.write(rest(a, n, c)+"");
		bw.close();
		sc.close();
	}
	public static long rest(long a, long n, long c) {
		if(n==0L) {
			return 1L%c;
		}
		else if (n%2L==0L) {
			long temp = rest(a, n/2L, c);
			return (temp*temp)%c;
		}
		else {
			long temp = rest(a, (n-1L)/2L, c);
			return (((a*temp)%c)*temp)%c;
		}
	}
}
