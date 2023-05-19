package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[]s = new String[n];
		for(int i=0; i<n; i++) {
			s[i]=br.readLine();
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s[0].length(); i++) {
			int count=1;
			char temp=s[0].charAt(i);
			for(int j=1; j<n; j++) {
				if(temp==s[j].charAt(i)) {
					count++;
				}
				else {
					j=n;
				}
			}
			if(count==n) {
				sb.append(String.valueOf(temp));
			}
			else {
				sb.append("?");
			}
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}
