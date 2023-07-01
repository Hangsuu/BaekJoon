package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Etc1434 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] a = new int[n];
		int[] b = new int[m];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			b[i] = Integer.parseInt(st2.nextToken());
		}
		int idx=0;
		int ans=0;
		for(int i=0; i<m; i++) {
			if(a[idx]>=b[i]) {
				a[idx]-=b[i];
			}
			else {
				ans+=a[idx];
				idx++;
				i--;
			}
		}
		for(int i=idx; i<n; i++) {
			ans+=a[i];
		}
		bw.write(ans+"");
		bw.close();
		br.close();
	}
}
