package step.bipartite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bipartite1654 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int[] arr = new int[n];
		long sum = 0L;
		long min = 0L;
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(br.readLine());
			arr[i] = temp;
			sum+=(long)temp;
		}
		long max = (sum/(long)k)+1L;
		long mid = (min+max)/2L;
		while(true) {
			mid = (min+max)/2L;
			int count=0;
			for(int i=0; i<n; i++) {
				count+=arr[i]/mid;
			}
			if(count>=k) {
				min=mid;
			}
			else if(count<k) {
				max=mid;
			}
			if((min+max)/2L==mid) {
				bw.write(min+"");
				break;
			}
		}
		bw.close();
		br.close();
	}
}
