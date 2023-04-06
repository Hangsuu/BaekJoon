package step.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		String num = "";
		while(true) {
			int r = n%b;
			if(r>=10) {
				char rChar = (char)(r+55);
				num=rChar+num;
			}
			else {
				num=r+num;
			}
			n/=b;
			if(n==0) {
				break;
			}
		}
		bw.write(num);
		bw.close();
		br.close();
	}
}
