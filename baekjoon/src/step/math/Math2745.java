package step.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[1]);
		int m = s[0].length();
		int num = 0;
		for(int i=0; i<m; i++) {
			char a = s[0].charAt(i);
			if(a>=48 && a<=57) {
				num+=(a-48)*Math.pow(n, m-i-1);
			}
			else {
				num+=(a-55)*Math.pow(n, m-i-1);
			}
		}
		bw.write(num+"");
		bw.close();
		br.close();
	}
}
