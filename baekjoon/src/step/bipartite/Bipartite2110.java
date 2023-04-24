package step.bipartite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bipartite2110 {
	private static int[] x;
	private static int[] narrow;
	private static int n=0;
	private static int c=0;
	private static int ans = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		x = new int[n];
		for(int i=0; i<n; i++) {
			x[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(x);
		narrow = new int[n-1];
		int max=0;
		int min=x[1]-x[0];
		for(int i=0; i<n-1; i++) {
			int temp = x[i+1]-x[i];
			narrow[i] = temp;
			min = Math.min(min, temp);
		}
		max = x[n-1]-x[0];
		wifi(max+1, min);
		bw.write(ans+"");
		bw.close();
		br.close();
	}
	public static void wifi(int max, int min) {
		if(max-min==1) {
			ans=min;
			return;
		}
		int mid = (max+min)/2;
		int count =0;
		int temp = 0;
		for(int i=0; i<n-1; i++) {
			if(temp+narrow[i]<mid) {
				temp+=narrow[i];
			}
			else {
				count++;
				temp=0;
			}
		}
		if(count>=c-1) {
			wifi(max, mid);
		}
		else {
			wifi(mid, min);
		}
	}
}
