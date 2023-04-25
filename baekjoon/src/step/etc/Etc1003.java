package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1003 {
	private static long[] arr = new long[41];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		arr[0] = 0L;
		arr[1] = 1L;
		arr[2] = 1L;
		for(int i=0; i<n; i++) {
			int m = Integer.parseInt(br.readLine());
			if(arr[m]==0) {
				fibo(m);
			}
			if(m==0) {
				bw.write("1 0\n");
			}
			else {
				bw.write(arr[m-1]+" "+arr[m]+"\n");
			}
		}
		bw.close();
		br.close();
	}
	private static void fibo(int n) {
		if(n==0 || n==1 || n==2) {
			return;
		}
		else if(arr[n]!=0) {
			return;
		}
		else {
			fibo(n-1);
			arr[n] = arr[n-1]+arr[n-2];
		}
	}
}
