package step.dijkstra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dijk11657 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=Integer.MAX_VALUE;
			}
		}
		for(int p=0; p<m; p++) {
			String[] s = br.readLine().split(" ");
			int i=Integer.parseInt(s[0])-1;
			int j =Integer.parseInt(s[1])-1;
			int c = Integer.parseInt(s[2]);
			arr[i][j] = Math.min(arr[i][j], c);
		}
		for(int i=0; i<n; i++) {
			arr[i][i] = 0;
		}
		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(arr[k][j]!=Integer.MAX_VALUE && arr[i][k]!=Integer.MAX_VALUE) {
						arr[i][j] = Math.min(arr[i][j], arr[k][j]+arr[i][k]);
					}
				}
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==Integer.MAX_VALUE) {
					bw.write("0 ");
				}
				else {
					bw.write(arr[i][j]+" ");
				}
			}
			bw.write("\n");
		}
		bw.close();
		br.close();
	}
}