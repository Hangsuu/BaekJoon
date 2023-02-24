package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Dynamic1912 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		int[] sum = new int[n];
		int max = num[0];
		sum[0] = num[0];
		for (int i=1; i<n; i++) {
			int temp = sum[i-1]+num[i];
			sum[i]= Math.max(temp, num[i]);
			max = Math.max(max, sum[i]);
		}
		bw.write(max+"");
		bw.close();
		br.close();
	}
}