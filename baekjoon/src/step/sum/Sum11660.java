package step.sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sum11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[][] arr = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				int temp = Integer.parseInt(st.nextToken());
				arr[i][j]=arr[i][j-1]+arr[i-1][j]+temp-arr[i-1][j-1];
			}
		}
		for(int i=0; i<m; i++) {
			String[] s2 = br.readLine().split(" ");
			int x1 = Integer.parseInt(s2[0]);
			int y1 = Integer.parseInt(s2[1]);
			int x2 = Integer.parseInt(s2[2]);
			int y2 = Integer.parseInt(s2[3]);
			int sum = arr[x2][y2]-arr[x1-1][y2]-arr[x2][y1-1]+arr[x1-1][y1-1];
			bw.write(sum+"\n");
		}
		bw.close();
		br.close();
	}
}
