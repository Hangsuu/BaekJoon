package step.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int num=1;
		for(int i=1; i<=Math.min(a, b); i++) {
			if(a%i==0 && b%i==0) {
				num=i;
			}
		}
		bw.write(num+"\n"+(num*(a/num)*(b/num)));
		bw.close();
		br.close();
	}
}