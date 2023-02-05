package step.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Brute1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[][] arr = new int[n][m];
		for(int i=0; i<n; i++) {
			String[] st = br.readLine().split("");
			for(int j=0; j<m; j++) {
				if(st[j].equals("W")) arr[i][j]=1;
				else arr[i][j]=0;
			}
		}
		int[][] chess = new int[8][8];
		String num = "0101010110101010010101011010101001010101101010100101010110101010";
		for(int i=0; i<64; i++) {
			chess[i/8][i%8]=num.charAt(i)-48;
		}
		int count=64;
		for(int i=0; i<=n-8; i++) {
			for(int j=0; j<=m-8; j++) {
				int temp=0;
				for(int k=i; k<i+8; k++) {
					for(int l=j; l<j+8; l++) {
						if(arr[k][l]!=chess[k-i][l-j]) temp++;
					}
				}
				if(temp>=32) temp=64-temp;
				if(temp<count) count=temp;
			}
		}
		bw.write(count+"");
		bw.close();
		br.close();
	}
}