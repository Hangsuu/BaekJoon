package step.divide;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Divide1629 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		long a = Long.parseLong(s[0]);
		long n = Long.parseLong(s[1]);
		long c = Long.parseLong(s[2]);
		
		bw.write(rest(a, n, c)+"");
		bw.close();
		br.close();
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
