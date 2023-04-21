package step.divide;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Divide11444 {
	private static long[][] basic = new long[2][2];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Long.parseLong(br.readLine());
		basic[0][0]=1L;
		basic[0][1]=1L;
		basic[1][0]=1L;
		if(n==0L) {
			bw.write("0");
		}
		else {
			long[][] ans = pow(basic, n);
			bw.write(ans[1][0]+"");
		}
		bw.close();
		br.close();
	}
	
	private static long[][] multiple(long[][] arr1, long[][]arr2){
		long[][] temp = new long[2][2];
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				long sum=0L;
				for(int k=0; k<2; k++) {
					sum+=arr1[i][k]*arr2[k][j]%1000000007L;
				}
				temp[i][j]=sum%1000000007L;
			}
		}
		return temp;
	}
	private static long[][] pow(long[][] arr, long n){
		if(n==1L) {
			return basic;
		}
		else if(n%2L==0L) {
			long[][] temp = pow(arr, n/2L);
			return multiple(temp, temp);
		}
		else {
			long[][] temp = pow(arr, (n-1L)/2L);
			return multiple(multiple(basic, temp), temp);
		}
	}
}
