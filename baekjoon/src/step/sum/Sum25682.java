package step.sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sum25682 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int k = Integer.parseInt(s[2]);
		int [][] arr =  new int [n+1][m+1];
		char [] color = new char[]{'B', 'W'};
		int min=k*k;
		for(int i=1; i<=n; i++) {
			String[] s1 = br.readLine().split("");
			for(int j=1; j<=m; j++) {
				char tempChar = s1[j-1].charAt(0);
				if(tempChar==color[(i+j)%2]) {
					arr[i][j] = arr[i][j-1]+arr[i-1][j]+1-arr[i-1][j-1];
				}
				else {
					arr[i][j] = arr[i][j-1]+arr[i-1][j]-arr[i-1][j-1];
				}
				if(i>=k && j>=k) {
					int temp = arr[i][j]-arr[i-k][j]-arr[i][j-k]+arr[i-k][j-k];
					temp = Math.min(temp, k*k-temp);
					min = Math.min(temp, min);
				}
			}
		}
		bw.write(min+"");
		bw.close();
		br.close();
	}
}