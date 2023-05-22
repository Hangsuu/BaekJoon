package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1049 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		int minSet=Integer.MAX_VALUE;
		int minEach = Integer.MAX_VALUE;
		for(int i=0; i<m; i++) {
			String[] temp = br.readLine().split(" ");
			minSet = Math.min(minSet, Integer.parseInt(temp[0]));
			minEach = Math.min(minEach, Integer.parseInt(temp[1]));
		}
		minSet = Math.min(minSet, minEach*6);
		
		int set = n/6;
		int c = n%6;
		
		int common = set*minSet+c*minEach;
		int over = (set+1)*minSet;
		bw.write(Math.min(common, over)+"");
		bw.close();
		br.close();
	}
}
