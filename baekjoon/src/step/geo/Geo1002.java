package step.geo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Geo1002 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().split(" ");
			int r1 = Integer.parseInt(s[2]);
			int x1 = Integer.parseInt(s[0]);
			int y1 = Integer.parseInt(s[1]);
			int r2 = Integer.parseInt(s[5]);
			int x2 = Integer.parseInt(s[3]);
			int y2 = Integer.parseInt(s[4]);
			int between = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
			int sum = (r1+r2)*(r1+r2);
			int subtract = (r1-r2)*(r1-r2);
			if(between==0) {
				if(r1==r2) bw.write(-1+"\n");
				else bw.write(0+"\n");
			}
			else if(between>sum) bw.write(0+"\n");
			else if(between==sum) bw.write(1+"\n");
			else if(between<sum && between>subtract) bw.write(2+"\n");
			else if(between==subtract) bw.write(1+"\n");
			else bw.write(0+"\n");
		}
		bw.close();
		br.close();
	}
}