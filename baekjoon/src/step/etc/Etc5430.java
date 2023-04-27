package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc5430 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String ac = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			s=s.replace("[", "");
			s=s.replace("]", "");
			String[] temp = s.split(",");
			int first = 0;
			int last = n-1;
			boolean r = true;
			for(int j=0; j<ac.length(); j++) {
				if(ac.charAt(j)=='R') {
					if(r==true) {
						r=false;
					}
					else {
						r=true;
					}
				}
				else {
					if(r==true) {
						first++;
					}
					else {
						last--;
					}
				}
			}
			if(last<first-1 || last<-1 || first>n) {
				bw.write("error\n");
			}
			else if(last+1==first) {
				bw.write("[]\n");
			}
			else {
				StringBuffer sb = new StringBuffer();
				sb.append("[");
				if(r) {
					for(int j=first; j<=last; j++) {
						sb.append(temp[j]);
						if(j!=last) {
							sb.append(",");
						}
					}
				}
				else {
					for(int j=last; j>=first; j--) {
						sb.append(temp[j]);
						if(j!=first) {
							sb.append(",");
						}
					}
				}
				sb.append("]\n");
				bw.write(sb.toString());
			}
			
		}
		bw.close();
		br.close();
	}
}
