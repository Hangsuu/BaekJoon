package step.bipartite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bipartite12015 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n+1];
		int count=0;
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(arr[count]<temp) {
				count++;
				arr[count]=temp;
			}
			else {
				int min=1;
				int max=count;
				while(min<max) {
					int mid = (min+max)/2;
					if(arr[mid]<temp) {
						min=mid+1;
					}
					else {
						max=mid;
					}
					
				}
				arr[min] = temp;
			}
		}
		bw.write(count+"");
		
		bw.close();
		br.close();
	}
}