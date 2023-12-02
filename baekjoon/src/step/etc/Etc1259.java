package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		while(true) {
			String s=br.readLine();
			if(s.equals("0")) break;
			int n = s.length();
			int count=0;
			for(int i=0; i<=n/2; i++) {
				if(s.charAt(i)!=s.charAt(n-1-i)) {
					count++;
					i=n/2+1;
				}
			}
			if(count==0) {
				bw.write("yes\n");
			}
			else {
				bw.write("no\n");
			}
		}
		bw.close();
		br.close();
	}
}