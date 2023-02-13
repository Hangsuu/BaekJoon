package step.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number1010 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int z = Integer.parseInt(br.readLine());
		for(int k=0; k<z; k++) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int n = Math.max(a, b);
			int m = Math.min(a, b);
			int[][] tri = new int[n+1][n+1];
			for(int i=0; i<n+1; i++) {
				for(int j=0; j<i+1; j++) {
					if(j==0 || j==i) tri[i][j] = 1;
					else tri[i][j] = tri[i-1][j-1] + tri[i-1][j];
				}
			}
			bw.write(tri[n][m]+"\n");
		}
		bw.close();
		br.close();
	}
}