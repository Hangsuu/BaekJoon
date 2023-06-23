package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Etc1402 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		int t = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[101];
		int count=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<t; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(arr[temp]) {
				count++;
			}
			else {
				arr[temp]=true;
			}
		}
		bw.write(count+"");
		bw.close();
		br.close();
	}
}
