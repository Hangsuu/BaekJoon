package step.bipartite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bipartite2805 {
	private static int ans=0;
	private static int[] arr;
	private static int n;
	private static int m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		int max = 0;
		int min = 0;
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr[i] = temp;
			max = Math.max(max, temp);
		}
		tree(min, max);
		bw.write(ans+"");
		bw.close();
		br.close();
	}
	static void tree(int min, int max) {
		if(max-1==min || max==min) {
			ans=min;
			return;
		}
		long mid = ((long)min+(long)max)/2L;
		long sum=0L;
		for(int i=0; i<n; i++) {
			if(arr[i]>mid) {
				sum+=(long)arr[i]-mid;
			}
		}
		if(sum>=m) {
			tree((int)mid, max);
			return;
		}
		else {
			tree(min, (int)mid);
			return;
		}
	}
}