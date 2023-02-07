package step.geo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Geo2477 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] seq = new int[] {4, 2, 3, 1};
		int[][] arr = new int[6][2];
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<6; i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}
		int idx=0;
		int first = arr[0][0];
		for(int i=0; i<4; i++) {
			if(seq[i]==first) idx=i;
		}
		int idx2=6;
		for(int i=0; i<6; i++) {
			if(arr[i][0]!=seq[(idx+i)%4]) {
				idx2+=i;
				break;
			}
		}
		int bigSize=arr[(idx2-4)%6][1]*arr[(idx2-3)%6][1];
		int smallSize=arr[(idx2)%6][1]*arr[(idx2-1)%6][1];
		bw.write((bigSize-smallSize)*n+"");
		bw.close();
		br.close();
	}
}