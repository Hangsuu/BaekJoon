package step.array;

import java.util.Scanner;

public class Array10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<n; i++) {
			if(arr[i]<x) {
				System.out.print(arr[i]);
				if( i<n-1) {
					System.out.print(" ");
				}
			}
		}
	}
}