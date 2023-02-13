package step.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number11051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[][] tri = new int[n+1][n+1];
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<i+1; j++) {
				if(j==0 || j==i) tri[i][j] = 1;
				else tri[i][j] = (tri[i-1][j-1] + tri[i-1][j])%10007;
			}
		}
		bw.write(tri[n][m]+"");
		bw.close();
		br.close();
	}
}