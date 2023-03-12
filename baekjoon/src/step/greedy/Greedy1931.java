package step.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy1931 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ") ;
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}
		Comparator<int[]> c = new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}
				else return o1[1]-o2[1];
			}
		};
		Arrays.sort(arr, c);
		
		int cnt=0;
		int lastTime = 0;
		for(int i=0; i<n; i++) {
			if(lastTime<=arr[i][0]) {
				cnt++;
				lastTime=arr[i][1];
			}
		}
		bw.write(cnt+"");
		bw.close();
		br.close();
	}
}