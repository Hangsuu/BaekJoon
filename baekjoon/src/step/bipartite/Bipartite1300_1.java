package step.bipartite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bipartite1300_1 {
	private static long ans=0L;
	private static long n;
	private static int k;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Long.parseLong(br.readLine());
		k = Integer.parseInt(br.readLine());
		count(1L, n*n);
		bw.write(ans+"");
		bw.close();
		br.close();
	}
	
	private static void count(long min, long max) {
		if(max==min) {
			ans=min;
			return;
		}
		long mid = (min+max)/2L;
		long count = 0L;
		for(int i=1; i<=n; i++) {
			count+=Math.min(mid/i, n);
		}
		if(count<k) {
			count(mid+1, max);
			return;
		}
		//카운트가 같으면 mid가 답이 될 수 있음
		else {
			count(min, mid);
			return;
		}
	}
}
