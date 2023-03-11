package step.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Greedy11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int cnt=0;
		for(int i=n-1; i>=0; i--) {
			if(arr[i]<=k) {
				cnt += k/arr[i];
				k %=arr[i];
			}
		}
		bw.write(cnt+"");
		bw.close();
		br.close();
	}
}