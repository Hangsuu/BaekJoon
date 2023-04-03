package step.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array10810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] list = new int[n+1];
		for(int z=0; z<m; z++) {
			String[] s1 = br.readLine().split(" ");
			int i = Integer.parseInt(s1[0]);
			int j = Integer.parseInt(s1[1]);
			int k = Integer.parseInt(s1[2]);
			for(int l=i; l<=j; l++) {
				list[l]=k;
			}
		}
		for(int i=1; i<=n; i++) {
			bw.write(list[i]+" ");
		}
		bw.close();
		br.close();
	}
}