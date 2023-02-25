package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic1932 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n+1];
		int[] temp = new int[n+1];
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			for(int j=1; j<=s.length; j++) {
				int tempNum=Integer.parseInt(s[j-1]);
				temp[j]=Math.max(tempNum+num[j-1], tempNum+num[j]);
			}
			for(int j=1; j<=s.length; j++) {
				num[j]=temp[j];
			}
		}
		int max=0;
		for(int i=1; i<=n; i++) {
			if(max<num[i])max=num[i];
		}
		bw.write(max+"");
		bw.close();
		br.close();
	}
}