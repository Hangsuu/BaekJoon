package step.back;

import java.util.Scanner;

public class Back14889_1 {
	static int [] arr;
	static boolean [] player;
	static int min = Integer.MAX_VALUE;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n * n];
		player = new boolean[n];
		player[0] = true;

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i * n + j] = sc.nextInt();
			}
		}
		sc.close();

		score(1, 1);
		System.out.println(min);
    }

	static void score(int num, int depth) {
		if(depth==n/2) {
    		diff();
    		return;
		}
		for(int i=num; i<n; i++) {
			player[i]=true;
			score(i+1, depth+1);
			player[i]=false;
		}
	}

	static void diff() {
		int a=0;
		int b=0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				int index = i * n + j;
				int index2 = j * n + i;
				if(player[i]==true && player[j]==true) {
					a += arr[index];
					a += arr[index2];
				}
				else if(player[i]==false && player[j]==false) {
					b += arr[index];
					b += arr[index2];
				}
			}
		}
		int temp = Math.abs(a-b);
        if(temp==0) {
			System.out.println(0);
			System.exit(0);
		}
		min = Math.min(temp, min);
	}
}