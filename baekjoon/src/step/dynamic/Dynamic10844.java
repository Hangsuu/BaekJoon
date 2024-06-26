package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic10844 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n+1][10];
		for(int i=1; i<=9; i++) {
			arr[1][i]=1;
		}
		for(int i=2; i<=n; i++) {
			arr[i][0]=arr[i-1][1];
			arr[i][9]=arr[i-1][8];
			for(int j=1; j<9; j++) {
				arr[i][j]=(arr[i-1][j-1]+arr[i-1][j+1])%1000000000;
			}
		}
		int sum=arr[n][0];
		for(int i=1; i<10; i++) {
			sum= (sum+arr[n][i])%1000000000;
		}
		bw.write(sum+"");
		bw.close();
		br.close();
	}
}