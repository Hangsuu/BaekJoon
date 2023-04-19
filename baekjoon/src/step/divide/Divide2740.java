package step.divide;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Divide2740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] a = br.readLine().split(" ");
		int an = Integer.parseInt(a[0]);
		int am = Integer.parseInt(a[1]);
		int[][] arrA = new int[an][am];
		for(int i=0; i<an; i++) {
			String[] temp = br.readLine().split(" ");
			for(int j=0; j<am; j++) {
				arrA[i][j] = Integer.parseInt(temp[j]);
			}
		}
		String[] b = br.readLine().split(" ");
		int bn = Integer.parseInt(b[0]);
		int bm = Integer.parseInt(b[1]);
		int[][] arrB = new int[bn][bm];
		for(int i=0; i<bn; i++) {
			String[] temp = br.readLine().split(" ");
			for(int j=0; j<bm; j++) {
				arrB[i][j] = Integer.parseInt(temp[j]);
			}
		}
		int[][] arr = new int[an][bm];
		for(int i=0; i<an; i++) {
			for(int k=0; k<bm; k++) {
				int sum=0;
				for(int j=0; j<am; j++) {
					sum+=arrA[i][j]*arrB[j][k];
				}
				arr[i][k]=sum;
			}
		}
		
		for(int i=0; i<an; i++) {
			for(int j=0; j<bm; j++) {
				bw.write(arr[i][j]+" ");
			}
			bw.write("\n");;
		}
		bw.close();
		br.close();
	}
}
