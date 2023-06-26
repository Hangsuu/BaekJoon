package step.dynamic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic11049 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		int[][] ans = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n-i; j++) {
				for(int l=j; l<j+i; l++) {
					if(ans[j][j+i]==0) {
						ans[j][j+i]=ans[j][l]+ans[l+1][j+i]+arr[j][0]*arr[l][1]*arr[j+i][1];
					}
					else {
						ans[j][j+i]=Math.min(ans[j][j+i], ans[j][l]+ans[l+1][j+i]+arr[j][0]*arr[l][1]*arr[j+i][1]);
					}
				}
			}
		}
		bw.write(ans[0][n-1]+"\n");
		bw.close();
		br.close();
	}
}
