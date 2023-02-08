package step.geo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Geo1004 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().split(" ");
			int x1 = Integer.parseInt(s[0]);
			int y1 = Integer.parseInt(s[1]);
			int x2 = Integer.parseInt(s[2]);
			int y2 = Integer.parseInt(s[3]);
			int n = Integer.parseInt(br.readLine());
			int count=0;
			for(int j=0; j<n; j++) {
				String[] s2 = br.readLine().split(" ");
				int cx = Integer.parseInt(s2[0]);
				int cy = Integer.parseInt(s2[1]);
				int cr = Integer.parseInt(s2[2]);
				int betweenS = (cx-x1)*(cx-x1)+(cy-y1)*(cy-y1);
				int betweenF = (cx-x2)*(cx-x2)+(cy-y2)*(cy-y2);
				if(betweenS<cr*cr || betweenF<cr*cr)count++;
				if(betweenS<cr*cr && betweenF<cr*cr)count--;
			}
			bw.write(count+"\n");
		}
		bw.close();
		br.close();
	}
}