package step.dynamic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Dynamic1520 {
	private static int[][] arr;
	private static int[][] ans;
	private static int[][] move = {{-1,0},{1,0},{0,-1},{0,1}};
	private static int m;
	private static int n;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		m = Integer.parseInt(s[0]);
		n = Integer.parseInt(s[1]);	
		arr = new int[m][n];
		ans = new int[m][n];
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				ans[i][j]=-1;
			}
		}
		bw.write(dfs(0, 0)+"");
		bw.close();
		br.close();
	}
	private static int dfs(int x, int y) {
		if(x==m-1 && y==n-1) return 1;
		if(ans[x][y]!=-1) {
			return ans[x][y];
		}
		ans[x][y]=0;
		int tempStep = arr[x][y];
		for(int i=0; i<4; i++) {
			int tempX = x+move[i][0];
			int tempY = y+move[i][1];
			if(tempX<0 || tempY<0 || tempX>=m || tempY>=n) {
				continue;
			}
			if(tempStep>arr[tempX][tempY]) {
				ans[x][y]+=dfs(tempX, tempY);
			}
		}
		return ans[x][y];
	}
}