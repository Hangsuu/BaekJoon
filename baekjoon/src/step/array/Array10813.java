package step.array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array10813 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] arr = new int[n+1];
		for(int i=0; i<=n; i++) {
			arr[i]=i;
		}
		for(int l=0; l<m; l++) {
			String[] s2 = br.readLine().split(" ");
			int i = Integer.parseInt(s2[0]);
			int j = Integer.parseInt(s2[1]);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int i=1; i<=n; i++) {
			bw.write(arr[i]+" ");
		}
		bw.close();
		br.close();
	}
}
