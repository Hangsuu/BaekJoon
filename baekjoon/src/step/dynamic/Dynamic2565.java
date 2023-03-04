package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Dynamic2565 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		int[] cnt = new int[n];
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}
		Arrays.sort(arr, (a,b)->a[0]-b[0]);
		cnt[0]=1;
		int cntMax=1;
		for(int i=1; i<n; i++) {
			int temp = arr[i][1];
			int max=0;
			for(int j=0; j<i; j++) {
				if(arr[j][1]<temp && max<cnt[j]) {
					max=cnt[j];
				}
			}
			cnt[i]=max+1;
			if(cntMax<max+1) cntMax=max+1;
		}
		bw.write((n-cntMax)+"");
		bw.close();
		br.close();
	}
}