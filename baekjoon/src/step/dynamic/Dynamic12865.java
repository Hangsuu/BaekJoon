package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic12865 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int[] value = new int[n+1];
		int[] kilo = new int[n+1];
		int[][] arr = new int[n+1][k+1];
		for(int i=1; i<=n; i++) {
			String[] s1 = br.readLine().split(" ");
			int w = Integer.parseInt(s1[0]);
			int v = Integer.parseInt(s1[1]);
			kilo[i]=w;
			value[i]=v;
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=k; j++) {
				if(j-kilo[i]>=0) {
					arr[i][j] = Math.max(arr[i-1][j], arr[i-1][j-kilo[i]]+value[i]);
				}
				else {
					arr[i][j] = arr[i-1][j];
				}
			}
		}
		bw.write(arr[n][k]+"");
		bw.close();
		br.close();
	}
}