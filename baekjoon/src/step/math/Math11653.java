package step.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math11653 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int i=2;
		while(n!=1) {
			if(n%i==0) {
				n/=i;
				bw.write(i+"\n");
				i=2;
			}
			else i++;
			if(n==i) {
				bw.write(n+"\n");
				break;
			}
		}
		br.close();
		bw.close();
	}
}