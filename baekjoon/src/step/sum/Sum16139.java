package step.sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sum16139 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();
		int[][] arr = new int[26][s.length()+1];
		for(int i=0; i<s.length(); i++) {
			int temp = (int) s.charAt(i)-97;
			arr[temp][i+1]++;
			for(int j=0; j<26; j++) {
				arr[j][i+1]+=arr[j][i];
			}
		}
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String[] temp = br.readLine().split(" ");
			int a = (int) temp[0].charAt(0)-97;
			int start = Integer.parseInt(temp[1]);
			int finish = Integer.parseInt(temp[2]);
			int count=arr[a][finish+1]-arr[a][start];
			bw.write(count+"\n");
		}
		bw.close();
		br.close();
	}
}
