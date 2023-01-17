package step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1546_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] s = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int max = arr[0];
		for(int i=0; i<n; i++) {
			if(max<arr[i]) max=arr[i];
		}
		double[] arrFix = new double[n];
		for(int i=0; i<n; i++) {
			arrFix[i] = (double) arr[i]/max*100;
		}
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += arrFix[i];
		}
		double average = sum/n;
		System.out.println(average);
	}
}