package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1356 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		String s = br.readLine();
		boolean you=false;
		for(int i=1; i<s.length(); i++) {
			String a = s.substring(0, i);
			String b = s.substring(i);
			int am=1;
			int bm=1;
			for(int j=0; j<a.length(); j++) {
				am*=a.charAt(j)-'0';
			}
			for(int j=0; j<b.length(); j++) {
				bm*=b.charAt(j)-'0';
			}
			if(am==bm) {
				you=true;
				i=s.length()+1;
			}
		}
		if(you) {
			bw.write("YES");
		}
		else {
			bw.write("NO");
		}
		bw.close();
		br.close();
	}
}