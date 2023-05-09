package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bfs2178 {
	private static boolean[][] arr;
	private static int[][] ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		arr = new boolean[n+2][m+2];
		ans = new int[n+2][m+2];
		for(int i=1; i<=n; i++) {
			String[] temp = br.readLine().split("");
			for(int j=0; j<m; j++) {
				if(temp[j].equals("1")) {
					arr[i][j+1]=true;
				}
			}
		}
		ans[1][1]=1;
		bfs(1, 1);
		bw.write(ans[n][m]+"");
		bw.close();
		br.close();
	}
	private static void bfs(int x, int y) {
		int temp = ans[x][y];
		if(arr[x+1][y]) {
			if(ans[x+1][y]==0 || ans[x+1][y]>temp+1) {
				ans[x+1][y]=temp+1;
				bfs(x+1, y);
			}
		}
		if(arr[x][y+1]) {
			if(ans[x][y+1]==0 || ans[x][y+1]>temp+1) {
				ans[x][y+1]=temp+1;
				bfs(x, y+1);
			}
		}
		if(arr[x-1][y]) {
			if(ans[x-1][y]==0 || ans[x-1][y]>temp+1) {
				ans[x-1][y]=temp+1;
				bfs(x-1, y);
			}
		}
		if(arr[x][y-1]) {
			if(ans[x][y-1]==0 || ans[x][y-1]>temp+1) {
				ans[x][y-1]=temp+1;
				bfs(x, y-1);
			}
		}
	}
}
