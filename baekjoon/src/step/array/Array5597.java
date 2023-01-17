package step.array;

import java.util.Scanner;

public class Array5597 {
	public static void main(String[] args) {
		int[] arr = new int[28];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=1; i<=30; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(i==arr[j])count++;
			}
			if (count==0) System.out.println(i);
		}
	}
}