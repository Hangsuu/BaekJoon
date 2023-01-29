package step.array2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array2563 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean[][] arr = new boolean[100][100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			int col = Integer.parseInt(s[0]);
			int row = Integer.parseInt(s[1]);
			for(int j=col; j<col+10; j++) {
				for(int k=row; k<row+10; k++) {
					arr[j][k] = true;
				}
			}
		}
		int count=0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(arr[i][j]) count++;
			}
		}
		bw.write(count+"");
		br.close();
		bw.close();
	}
}