package step.array;

import java.util.Scanner;

public class Array2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
		sc.close();
		int max = arr[0];
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
	}
}