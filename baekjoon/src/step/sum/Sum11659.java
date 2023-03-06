package step.sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sum11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] arr = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<m; i++) {
			String[] s1 = br.readLine().split(" ");
			int a = Integer.parseInt(s1[0]);
			int b = Integer.parseInt(s1[1]);
			bw.write((arr[b]-arr[a-1])+"\n");
		}
		bw.close();
		br.close();
	}
}