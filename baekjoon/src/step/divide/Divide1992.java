package step.divide;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Divide1992 {
	private static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+1][n+1];
		for(int i=1; i<n+1; i++) {
			String[] s = br.readLine().split("");
			for(int j=1; j<n+1; j++) {
				arr[i][j] = s[j-1].equals("0")?0:1;
			}
		}
		quad(arr, n, 1, 1);
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
	
	private static void quad(int[][] arr, int n, int i, int j) {
		int black = 0;
		int white = 0;
		for(int k=i; k<i+n; k++) {
			for(int l=j; l<j+n; l++) {
				if(arr[k][l]==0) white++;
				else black++;
			}
		}
		if(white==n*n) {
			sb.append("0");
			return;
		}
		else if(black==n*n) {
			sb.append("1");
			return;
		}
		else {
			sb.append("(");
			quad(arr, n/2, i, j);
			quad(arr, n/2, i, j+n/2);
			quad(arr, n/2, i+n/2, j);
			quad(arr, n/2, i+n/2, j+n/2);
			sb.append(")");
			return;
		}
	}
}
