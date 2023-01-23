package step.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] s = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int v = Integer.parseInt(s[2]);
		
		bw.write((v-b-1)/(a-b)+1+"");
		bw.close();
		br.close();
	}
}