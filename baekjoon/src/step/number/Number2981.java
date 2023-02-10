package step.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Number2981 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		int first = arr[1]-arr[0];
		for(int i=1; i<n; i++) {
			first = common(first, arr[i]-arr[i-1]);
		}
		for(int i=2; i<=first; i++) {
			if(first%i==0) {
				bw.write(i+" ");
			}
		}
		bw.close();
		br.close();
	}
	public static int common(int a, int b) {
		while(b!=0) {
			int temp = a%b;
			a = b;
			b = temp;
		}
		return a;
	}
}