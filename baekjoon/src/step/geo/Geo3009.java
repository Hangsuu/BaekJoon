package step.geo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Geo3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[][] arr = new int[3][2];
		for(int i=0; i<3; i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}
		int lnum=0;
		int rnum=0;
		for(int i=0; i<3; i++) {
			int l=0;
			int r=0;
			for(int j=0; j<3; j++) {
				if(arr[i][0]==arr[j][0]) l++;
				if(arr[i][1]==arr[j][1]) r++;
			}
			if(l==1) lnum=arr[i][0];
			if(r==1) rnum=arr[i][1];
		}
		bw.write(lnum+" "+rnum);
		bw.close();
		br.close();
	}
}