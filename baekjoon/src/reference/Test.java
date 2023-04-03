package reference;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] arr = new int[n+1];
		for(int i=1; i<n+1; i++) {
			arr[i]=i;
		}
		for(int l=0; l<m; l++) {
			String[] s2 = br.readLine().split(" ");
			int i = Integer.parseInt(s2[0]);
			int j = Integer.parseInt(s2[1]);
			int k = Integer.parseInt(s2[2]);
			int[] temp = new int[k-i];
			for(int o=0; o<temp.length; o++) {
				temp[o]=arr[i+o];
			}
			for(int o=0; o<j-k+1; o++) {
				arr[i+o]=arr[k+o];
			}
			for(int o=0; o<temp.length; o++) {
				arr[i+j-k+1+o]=temp[o];
			}
		}
		for(int i=1; i<n+1; i++) {
			bw.write(arr[i]+" ");
		}
		bw.close();
		br.close();
	}
}