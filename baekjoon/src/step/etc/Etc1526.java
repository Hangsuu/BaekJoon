package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1526 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		String s = br.readLine();
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char temp = s.charAt(i);
			if(temp>='0' && temp<='9') {
				count+=((int)(temp-'0'))*Math.pow(16, s.length()-i-1);
			}
			else {
				count+=((int)(temp-'A'+10))*Math.pow(16, s.length()-i-1);
			}
		}
		bw.write(count+"");
		bw.close();
		br.close();
	}
}
