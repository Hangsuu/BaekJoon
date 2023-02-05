package step.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Brute2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int i = 0;
		if(n-9*s.length()<=0) i=0;
		else i=n-9*s.length();
		for(int j=i; j<n; j++) {
			int sub=j;
			int sum=j;
			String subNum = j+"";
			for(int k=0; k<subNum.length(); k++) {
				sum += sub%10;
				sub /= 10;
			}
			if(sum==n) {
				bw.write(j+"");
				break;
			}
			if(j==n-1) bw.write("0");
		}
		bw.close();
		br.close();
	}
}