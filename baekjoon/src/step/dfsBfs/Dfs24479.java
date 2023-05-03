package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Dfs24479 {
	private static int index=2;
	private static int[] ans;
	private static ArrayList<ArrayList<Integer>> dfs = new ArrayList<>();;
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
		ans = new int[n+1];
		for(int i=0; i<=n; i++) {
			dfs.add(new ArrayList<>());
		}
		for(int t=0; t<m; t++) {
			String[] s2 = br.readLine().split(" ");
			int x = Integer.parseInt(s2[0]);
			int y = Integer.parseInt(s2[1]);
			dfs.get(x).add(y);
			dfs.get(y).add(x);
		}
		for(int i=1; i<=n; i++) {
			Collections.sort(dfs.get(i));
		}
		ans[r]=1;
		dfs(r);
		for(int i=1; i<=n; i++) {
			bw.write(ans[i]+"\n");
		}
		bw.close();
		br.close();
	}
	private static void dfs(int k) {
		for(int i=0; i<dfs.get(k).size(); i++) {
			int temp = dfs.get(k).get(i);
			if(ans[temp]==0) {
				ans[temp]=index;
				index++;
				dfs(temp);
			}
		}
	}
}
