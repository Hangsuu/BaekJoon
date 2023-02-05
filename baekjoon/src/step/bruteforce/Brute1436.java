package step.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Brute1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count=0;
		int num=665;
		while(count!=n) {
			num++;
			String s = num+"";
			if(s.contains("666")) count++;
		}
		bw.write(num+"");
		bw.close();
		br.close();
	}
}