package step.dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dfs24479 {
	private static int[] count;
	private static int[] index;
	private static int[][] dfs;
	private static int n;
	private static int m;
	private static int r;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		r = Integer.parseInt(s[2]);
		count = new int[n+1];
		index = new int[m];
		dfs = new int[n+1][m];
		for(int t=0; t<m; t++) {
			String[] s2 = br.readLine().split(" ");
			int x = Integer.parseInt(s2[0]);
			int y = Integer.parseInt(s2[1]);
			dfs[x][index[x]] = y;
			index[x]++;
		}
		dfs(r);
		for(int i=1; i<=n; i++) {
			bw.write(count[i]+"\n");
		}
		bw.close();
		br.close();
	}
	private static void dfs(int k) {
		for(int i=0; i<m; i++) {
			if(dfs[k][i]==0) {
				i=m;
			}
			else {
				if(count[dfs[k][i]]==0) {
					count[dfs[k][i]] = count[k]+1;
				}
				else {
					count[dfs[k][i]] = Math.min(count[k]+1, count[dfs[k][i]]);
				}
				dfs(dfs[k][i]);
			}
		}
	}
}
