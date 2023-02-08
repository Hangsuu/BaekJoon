package step.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] s = br.readLine().split(" "); 
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			if(n==0) break;
			boolean factor = m%n==0;
			boolean multiple = n%m==0;
			if(factor) bw.write("factor\n");
			else if(multiple) bw.write("multiple\n");
			else bw.write("neither\n");
		}
		bw.close();
		br.close();
	}
}