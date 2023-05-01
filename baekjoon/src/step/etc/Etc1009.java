package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1009 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int u=0; u<t; u++) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			a%=10;
			int b = Integer.parseInt(s[1]);
			int temp=1;
			for(int i=0; i<b; i++) {
				temp = (temp*a)%10;
			}
			if(temp==0) temp=10;
			bw.write(temp+"\n");
		}
		bw.close();
		br.close();
	}
}
