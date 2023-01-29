package step.array2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		for(int i=0; i<n; i++) {
			int k = Integer.parseInt(br.readLine());
			arr[k]++;
		}

		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=0) {
				for(int j=0; j<arr[i]; j++) {
					bw.write(i+"\n");
				}
			}
		}
		br.close();
		bw.close();
	}
}