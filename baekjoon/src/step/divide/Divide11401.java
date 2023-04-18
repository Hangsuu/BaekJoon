package step.divide;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Divide11401 {
	private static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		arr=new int[n+1][n+1];
		bw.write(pascal(n, k)+"");
		bw.close();
		br.close();
	}
	private static int pascal(int n, int k) {
		if(arr[n][k]==0) {
			if(k==0 || k==n) {
				arr[n][k]=1;
			}
			else {
				arr[n][k]=(pascal(n-1, k-1)+pascal(n-1, k))%1000000007;
			}
		}
		return arr[n][k];
	}
}
