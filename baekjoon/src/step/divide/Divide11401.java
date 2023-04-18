package step.divide;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Divide11401 {
	private static long p = 1000000007;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		long n = Long.parseLong(s[0]);
		long k = Long.parseLong(s[1]);
		
		long top = factorial(n);
		long bottom = factorial(k)*factorial(n-k)%p;
		bw.write((top*pow(bottom, p-2)%p)+"");
		
		bw.close();
		br.close();
	}
	private static long factorial(long n) {
		long num=1L;
		for(long i=1; i<=n; i++) {
			num=num*i%p;
		}
		return num;
	}
	private static long pow(long num, long n) {
		if(n==0L) {
			return 1L;
		}
		else if (n%2L==0L) {
			long temp = pow(num, n/2L)%p;
			return (temp*temp)%p;
		}
		else {
			long temp = pow(num, (n-1L)/2L);
			return (((num*temp)%p)*temp)%p;
		}
	}
}
