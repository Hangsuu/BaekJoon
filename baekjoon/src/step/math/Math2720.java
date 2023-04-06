package step.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math2720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int money = Integer.parseInt(br.readLine());
			bw.write(money/25+" "+money%25/10+" "+money%25%10/5+" "+money%25%10%5+"\n");
		}
		bw.close();
		br.close();
	}
}
