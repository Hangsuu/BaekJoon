package step.divide;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Divide1780 {
	private static int minus=0;
	private static int zero=0;
	private static int plus=0;
	private static int[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		for(int i=1; i<n+1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<n+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		count(n, 1, 1);
		bw.write(minus+"\n"+zero+"\n"+plus);
		bw.close();
		br.close();
	}
	private static void count(int n, int i, int j) {
		int temp = arr[i][j];
		boolean sameNum =same(temp,n,i,j);
		if(sameNum) {
			return;
		}
		else {
			count(n/3, i, j);
			count(n/3, i+n/3, j);
			count(n/3, i+n/3*2, j);
			count(n/3, i, j+n/3*2);
			count(n/3, i, j+n/3);
			count(n/3, i+n/3, j+n/3);
			count(n/3, i+n/3*2, j+n/3);
			count(n/3, i+n/3, j+n/3*2);
			count(n/3, i+n/3*2, j+n/3*2);
			return;
		}
	}
	private static boolean same(int temp, int n, int i, int j) {
		for(int k=i; k<i+n; k++) {
			for(int l=j; l<j+n; l++) {
				if(arr[k][l]!=temp) {
					return false;
				}
			}
		}
		if(temp==-1)minus++;
		else if(temp==0) zero++;
		else plus++;
		return true;
	}
}
