package step.divide;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Divide10830 {
	private static int[][] base;
	private static int an=0;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		an = sc.nextInt();
		long cnt = sc.nextLong();
		base = new int[an][an];
		for(int i=0; i<an; i++) {
			for(int j=0; j<an; j++) {
				base[i][j] = sc.nextInt()%1000;
			}
		}

		int[][] ans = pow(base, cnt);
		for(int i=0; i<an; i++) {
			for(int j=0; j<an; j++) {
				bw.write(ans[i][j]+" ");
			}
			bw.write("\n");;
		}
		bw.close();
		sc.close();
	}
	private static int[][] multiple(int[][] arr1, int[][] arr2){
		int[][] temp = new int[an][an];
		for(int i=0; i<an; i++) {
			for(int k=0; k<an; k++) {
				int sum=0;
				for(int j=0; j<an; j++) {
					sum+=arr1[i][j]*arr2[j][k]%1000;
				}
				temp[i][k]=sum%1000;
			}
		}
		return temp;
	}
	
	private static int[][] pow(int[][] arr, long cnt) {
		if(cnt==1L) {
			return arr;
		}
		else if(cnt==2L) {
			return multiple(arr, base);
		}
		else if (cnt%2L==0L) {
			int[][] temp = pow(arr, cnt/2L);
			return multiple(temp, temp);
		}
		else {
			int[][] temp = pow(arr, (cnt-1L)/2L);
			return multiple(arr, multiple(temp, temp));
		}
	}
	
}
