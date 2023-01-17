package step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] s = br.readLine().split(" ");
		int max = 0;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(s[i]);
			if(max<arr[i]) max=arr[i];
		}
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += (double) arr[i]/max*100;
		}
		double average = sum/n;
		System.out.println(average);
	}
}