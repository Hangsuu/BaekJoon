package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int u=0; u<t; u++) {
			String[] s = br.readLine().split(" ");
			int m = Integer.parseInt(s[0]);
			int n = Integer.parseInt(s[1]);
			int k = Integer.parseInt(s[2]);
			boolean[][] arr = new boolean[m][n];
			for(int i=0; i<k; i++) {
				String[] s2 = br.readLine().split(" ");
				int x = Integer.parseInt(s2[0]);
				int y = Integer.parseInt(s2[1]);
				arr[x][y]=true;
			}
			int count=0;
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(i==0 && j==0 && arr[i][j]) count++;
					else if(i==0 && j!=0 && arr[i][j] && !arr[i][j-1]) count++;
					else if(i!=0 && j==0 && arr[i][j] && !arr[i-1][j]) count++;
					else if((i!=0 && !arr[i-1][j]) && (j!=0 && !arr[i][j-1]) && arr[i][j]) count++;
				}
			}
			bw.write(count+"\n");
		}
		bw.close();
		br.close();
	}
}
