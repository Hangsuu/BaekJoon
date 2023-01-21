package step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Array4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		DecimalFormat df = new DecimalFormat("0.000");
		for(int i=0; i<c; i++) {
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int[] arr = new int[n];
			int sum=0;
			for(int j=1; j<=n; j++) {
				arr[j-1]=Integer.parseInt(s[j]);
				sum += arr[j-1];
			}
			double average = (double)sum/n;
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]>average) count++;
			}
			double per = (double) Math.round((double)count/n*100000) /1000;
			System.out.println(df.format(per)+"%");
		}
	}
}