package step.sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Sum10986 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		long cnt = 0L;
		int[] arr = new int[n];
		int[] rest = new int[m];
		arr[0] = Integer.parseInt(st.nextToken())%m;
		if(arr[0]==0) cnt++;
		rest[arr[0]]++;
	    for (int i=1; i<n; i++) {
	        int temp = Integer.parseInt(st.nextToken())%m;
	        int num = (arr[i-1] + temp) % m;
	        arr[i] = num;
	        if (num == 0) cnt++;
	        if (num < 0) {
	            num += m;
	        }
	        rest[num]++;
	    }
		for(int i=0; i<m; i++) {
			if(rest[i]>1) {
				cnt += rest[i]*(long)(rest[i]-1)/2;
			}
		}
		bw.write(cnt+"");
		bw.close();
		br.close();
	}
}