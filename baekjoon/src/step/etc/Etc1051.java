package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1051 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[][] arr = new int[n][m];
		for(int i=0; i<n; i++) {
			String[] temp = br.readLine().split("");
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(temp[j]);
			}
		}
		int max=1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				int temp = arr[i][j];
				for(int k=j; k<m; k++) {
					int num = arr[i][k];
					if(temp==num) {
						int side = k-j;
						if(i+side<n) {
							if(temp==arr[i+side][j] && temp==arr[i+side][k]) {
								max = Math.max(max, (side+1)*(side+1));
							}
						}
					}
				}
			}
		}
		bw.write(max+"");
		bw.close();
		br.close();
	}
}
