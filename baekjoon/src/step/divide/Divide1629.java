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
		int n = Integer.parseInt(s[1]);
		long c = Long.parseLong(s[2]);
		
		bw.write(rest(a, n, c)+"");
		bw.close();
		br.close();
	}
	public static long rest(long a, int n, long c) {
		if(n==0) {
			return 1;
		}
		else if (n%2==0) {
			long temp = rest(a, n/2, c);
			return (temp*temp)%c;
		}
		else {
			long temp = rest(a, (n-1)/2, c);
			return (a*temp*temp)%c;
		}
	}
}
