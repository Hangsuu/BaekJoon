package step.dynamic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Dynamic11066 {
	static long[] arr = new long[101];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int k=0; k<t; k++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			int[][] dp = new int[n][n];

			for(int i=0; i<n; i++) {
				int temp = Integer.parseInt(st.nextToken());
				arr[i] = temp;
				dp[i][i] = temp;
			}
			
		}
		bw.close();
		br.close();
	}
}