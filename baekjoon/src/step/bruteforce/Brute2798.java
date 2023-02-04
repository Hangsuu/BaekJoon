package step.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Brute2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
		
		int max=0;
		for(int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int k=j+1; k<n; k++) {
					int num = arr[i]+arr[j]+arr[k];
					if(num<=m && num>max) max=num;
				}
			}
		}
		bw.write(max+"");
		bw.close();
		br.close();
	}
}