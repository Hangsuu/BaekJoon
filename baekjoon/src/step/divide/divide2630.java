package step.divide;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class divide2630 {
	private static int white=0;
	private static int blue=0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+1][n+1];
		for(int i=1; i<n+1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<n+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		color(arr, n, 1, 1);
		bw.write(white+"\n"+blue);
		bw.close();
		br.close();
	}
	private static void color(int[][] arr, int n, int i, int j) {
		int whiteCnt = 0;
		int blueCnt = 0;
		for(int k=i; k<i+n; k++) {
			for(int l=j; l<j+n; l++) {
				if(arr[k][l]==0) whiteCnt++;
				else blueCnt++;
			}
		}
		if(whiteCnt==n*n) {
			white++;
			return;
		}
		else if(blueCnt==n*n) {
			blue++;
			return;
		}
		else {
			color(arr, n/2, i, j);
			color(arr, n/2, i+n/2, j);
			color(arr, n/2, i, j+n/2);
			color(arr, n/2, i+n/2, j+n/2);
			return;
		}
	}
}
