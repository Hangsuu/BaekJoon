package step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] s = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=1; i<n; i++) {
			if(min>arr[i]) min = arr[i];
			if(max<arr[i]) max = arr[i];
		}
		System.out.println(min + " " + max);
	}
}