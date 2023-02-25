package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic1149 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] sum = new int[3];
		int[] temp = new int[3];
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		sum[0] = Integer.parseInt(s[0]);
		sum[1] = Integer.parseInt(s[1]);
		sum[2] = Integer.parseInt(s[2]);
		for(int i=1; i<n; i++) {
			String[] s2 = br.readLine().split(" ");
			int r = Integer.parseInt(s2[0]);
			int g = Integer.parseInt(s2[1]);
			int b = Integer.parseInt(s2[2]);
			temp[0] = Math.min(r+sum[1], r+sum[2]);
			temp[1] = Math.min(g+sum[0], g+sum[2]);
			temp[2] = Math.min(b+sum[0], b+sum[1]);
			sum[0]=temp[0];
			sum[1]=temp[1];
			sum[2]=temp[2];
		}
		int min = Math.min(sum[0], sum[1]);
		min = Math.min(sum[2], min);
		bw.write(min+"");
		bw.close();
		br.close();
	}
}