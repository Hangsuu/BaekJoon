package step.time;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Time24313 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int a1 = Integer.parseInt(s[0]);
		int a0 = Integer.parseInt(s[1]);
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		if(a1>c) {
			bw.write("0");
		}
		else if(a1==c) {
			if(a0<=0) {
				bw.write("1");
			}
			else {
				bw.write("0");
			}
		}
		else {
			if(a0/(c-a1)<=n0) {
				bw.write("1");
			}
			else {
				bw.write("0");
			}
		}
		bw.close();
		br.close();
	}
}