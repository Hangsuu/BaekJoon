package step.dynamic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
			int[][] arr = new int[n][n];
			int[] sum = new int[n+1];
			for(int i=0; i<n; i++) {
				int temp = Integer.parseInt(st.nextToken());
				sum[i+1]=sum[i]+temp;
			}
			for(int i=1; i<=n; i++) {
				for(int j=0; j<n-i; j++) {
					for(int l=j; l<j+i; l++) {
						if(arr[j][j+i]==0) {
							arr[j][j+i]=arr[j][l]+arr[l+1][j+i]+sum[j+i+1]-sum[j];
						}
						else {
							arr[j][j+i]=Math.min(arr[j][j+i], arr[j][l]+arr[l+1][j+i]+sum[j+i+1]-sum[j]);
						}
					}
				}
			}
			bw.write(arr[0][n-1]+"\n");
		}
		bw.close();
		br.close();
	}
}