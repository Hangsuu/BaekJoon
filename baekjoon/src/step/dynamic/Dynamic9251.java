package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic9251 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s1 = br.readLine().split("");
		String[] s2 = br.readLine().split("");
		int[][] arr = new int[s1.length+1][s2.length+1];
		for(int i=1; i<s1.length+1; i++) {
			String s = s1[i-1];
			for(int j=1; j<s2.length+1; j++) {
				if(s.equals(s2[j-1])) {
					arr[i][j]=arr[i-1][j-1]+1;
				}
				else arr[i][j]=Math.max(arr[i-1][j], arr[i][j-1]);
			}
		}
		bw.write(arr[s1.length][s2.length]+"");
		bw.close();
		br.close();
	}
}