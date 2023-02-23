package step.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back14889 {
	static int [][] arr;
	static boolean [] player;
	static int min = Integer.MAX_VALUE;
	static int n;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		player = new boolean[n];
		player[0] = true;
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		br.close();
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
			score(num+1, depth+1);        
			player[i]=false;
		}
	}
	
	static void diff() {
		int a=0;
		int b=0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(player[i]==true && player[j]==true) {
					a+=arr[i][j];
					a+=arr[j][i];
				}
				else if(player[i]==false && player[j]==false) {
					b+=arr[i][j];
					b+=arr[j][i];
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