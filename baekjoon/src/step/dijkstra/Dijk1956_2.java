package step.dijkstra;

import java.io.*;
import java.util.Arrays;

// 다익스트라 시간초과로 인해 플로이드 워셜로 품
public class Dijk1956_2 {
	static final int max = 5000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] s = br.readLine().split(" ");
		int v = Integer.parseInt(s[0]);
		int e = Integer.parseInt(s[1]);

		int[][] arr = new int[v][v];
		for(int[] row : arr) {
			Arrays.fill(row, max);
		}

		for(int p=0; p<e; p++) {
			String[] s2 = br.readLine().split(" ");
			int i = Integer.parseInt(s2[0])-1;
			int j = Integer.parseInt(s2[1])-1;
			int c = Integer.parseInt(s2[2]);
			arr[i][j] = c;
		}

		for(int k=0; k<v; k++) {
			for(int i=0; i<v; i++) {
				for(int j=0; j<v; j++) {
					arr[i][j] = Math.min(arr[i][j], arr[k][j]+arr[i][k]);
				}
			}
		}
		int min = max;
		for(int i=0; i<v; i++) {
			min = Math.min(arr[i][i], min);
		}
		if(min == max) {
			bw.write("-1");
		} else {
			bw.write(min + "");
		}
		bw.close();
		br.close();
	}
}
