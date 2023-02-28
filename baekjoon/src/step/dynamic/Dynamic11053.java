package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Dynamic11053 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int[] num = new int[n+1];
		int[] cnt = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		num[1] = Integer.parseInt(st.nextToken());
		cnt[1] = 1;
		int cntMax=1;
		for(int i=2; i<=n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			num[i]=temp;
			int max = 0;
			for(int j=1; j<i; j++) {
				if(temp>num[j] && max<cnt[j]) {
					max=cnt[j];
				}
			}
			cnt[i]=max+1;
			if(cntMax<max+1) cntMax=max+1;
		}
		bw.write(cntMax+"");
		bw.close();
		br.close();
	}
}