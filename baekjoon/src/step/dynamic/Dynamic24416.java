package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic24416 {
	static int fibCnt=0;
	static int dynaCnt=0;
	static int[] arr = new int[40];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		arr[0]=1;
		arr[1]=1;
		fib(n);
		dyna(n);
		bw.write(fibCnt+" "+dynaCnt);
		bw.close();
		br.close();
	}
	
	static int fib(int n) {
		if(n==1 || n==2) {
			fibCnt++;
			return 1;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}
	
	static int dyna(int n) {
		dynaCnt++;
		if(arr[n-1]>0) return arr[n-1];
		else {
			if(arr[n-3]==0) arr[n-3]=dyna(n-2);
			if(arr[n-2]==0) arr[n-2]=dyna(n-1);
			return arr[n-3]+arr[n-2];
		}
	}
}