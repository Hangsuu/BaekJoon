package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bfs1012 {
	private static boolean[][] arr;
	private static int count=0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int p=0; p<t; p++) {
			count=0;
			String[] s = br.readLine().split(" ");
			int m = Integer.parseInt(s[0]);
			int n = Integer.parseInt(s[1]);
			int k = Integer.parseInt(s[2]);
			
			arr = new boolean[n+2][m+2];
			for(int i=0; i<k; i++) {
				String[] s1 = br.readLine().split(" ");
				int x = Integer.parseInt(s1[0]);
				int y = Integer.parseInt(s1[1]);
				arr[y+1][x+1]=true;
			}
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=m; j++) {
					if(arr[i][j]) {
						count++;
						bfs(i, j);
					}
				}
			}
			bw.write(count+"\n");
		}
		bw.close();
		br.close();
	}
	private static void bfs(int x, int y) {
		arr[x][y]=false;
		if(arr[x+1][y]) {
			bfs(x+1, y);
		}
		if(arr[x][y+1]) {
			bfs(x, y+1);
		}
		if(arr[x-1][y]) {
			bfs(x-1, y);
		}
		if(arr[x][y-1]) {
			bfs(x, y-1);
		}
	}
}
