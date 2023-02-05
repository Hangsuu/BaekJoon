package step.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Brute7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int [][] arr = new int [n][2];
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}
		for(int i=0; i<n; i++) {
			int count=1;
			for(int j=0; j<n; j++) {
				if(arr[j][0]>arr[i][0] && arr[j][1]>arr[i][1]) count++;
			}
			bw.write(count+" ");
		}
		br.close();
		bw.close();
	}
}