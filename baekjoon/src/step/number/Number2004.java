package step.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number2004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int a = is5(n)-is5(m)-is5(n-m);
		int b = is2(n)-is2(m)-is2(n-m);
		bw.write(Math.min(a, b)+"");
		bw.close();
		br.close();
	}
	public static int is5(int x) {
		int count=0;
		while(true) {
			if(x<5) break;
			count+=x/5;
			x /= 5;
		}
		return count;
	}
	public static int is2(int x) {
		int count=0;
		while(true) {
			if(x<2) break;
			count+=x/2;
			x /=2;
		}
		return count;
	}
}