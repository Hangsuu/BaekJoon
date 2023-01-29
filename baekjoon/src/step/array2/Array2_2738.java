package step.array2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array2_2738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[][] arr = new int[n][m];
		for(int i=0; i<n; i++) {
			String[] num = br.readLine().split(" ");
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(num[j]);
			}
		}
		for(int i=0; i<n; i++) {
			String[] num = br.readLine().split(" ");
			for(int j=0; j<m; j++) {
				bw.write(arr[i][j]+Integer.parseInt(num[j])+" ");
			}
			bw.write("\n");
		}
		br.close();
		bw.close();
	}
}