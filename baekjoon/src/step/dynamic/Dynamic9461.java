package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic9461 {
	static long[] arr = new long[101];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(tri(n)+"\n");
		}
		bw.close();
		br.close();
	}
	
	static long tri(int n) {
		if(n==1 || n==2 || n==3) {
			return 1L;
		}
		if(n==4 || n==5) {
			return 2L;
		}
		else {
			if(arr[n-1]==0)arr[n-1]=tri(n-1);
			if(arr[n-5]==0)arr[n-5]=tri(n-5);
			arr[n]=arr[n-1]+arr[n-5];
			return arr[n];
		}
	}
}