package step.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Stack4949 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int m=0;
			String[] s = br.readLine().split("");
			for(int j=0; j<s.length; j++) {
				String temp = s[j];
				if(temp.equals("(")){
					m++;
				}
				else{
					if(m>0) {
						m--;
					}
					else {
						m++;
						j=s.length;
					}
				}
			}
			if(m==0) {
				bw.write("YES\n");
			}
			else {
				bw.write("NO\n");
			}
		}
		bw.close();
		br.close();
	}
}