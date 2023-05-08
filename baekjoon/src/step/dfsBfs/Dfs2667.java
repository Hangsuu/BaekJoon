package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dfs2667 {
	private static boolean[][] arr;
	private static List<Integer> ans = new ArrayList<>();
	private static int count=1;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		arr = new boolean[n+2][n+2];
		
		for(int i=1; i<=n; i++) {
			String[] s = br.readLine().split("");
			for(int j=0; j<n; j++) {
				if(s[j].equals("1")) {
					arr[i][j+1]=true;
				}
			}
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(arr[i][j]) {
					dfs(i, j);
					ans.add(count);
					count=1;
				}
			}
		}
		bw.write(ans.size()+"\n");
		Collections.sort(ans);
		for(int i : ans) {
			bw.write(i+"\n");
		}
		bw.close();
		br.close();
	}
	
	private static void dfs(int x, int y) {
		arr[x][y]=false;
		if(arr[x+1][y]) {
			dfs(x+1, y);
			count++;
		}
		if(arr[x-1][y]) {
			dfs(x-1, y);
			count++;
		}
		if(arr[x][y+1]) {
			dfs(x, y+1);
			count++;
		}
		if(arr[x][y-1]) {
			dfs(x, y-1);
			count++;
		}
	}
}