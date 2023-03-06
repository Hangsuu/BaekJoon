package step.sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sum2559 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n+1];
		int sum[] = new int[n+1];
		int max = -100000000;
		for(int i=1; i<=n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr[i] = temp;
			sum[i] = sum[i-1]+temp;
			if(i>=m) {
				sum[i]-=arr[i-m];
				max = Math.max(max, sum[i]);
			}
		}
		bw.write(max+"");
		bw.close();
		br.close();
	}
}