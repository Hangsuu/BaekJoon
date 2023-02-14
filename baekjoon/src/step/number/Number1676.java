package step.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number1676 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count=0;
		for(int i=n; i>=1; i--) {
			int temp=i;
			while(true) {
				if(temp%5==0) {
					count++;
					temp/=5;
				}
				else break;
			}
		}
		bw.write(count+"");
		bw.close();
		br.close();
	}
}