package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic2156 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[3];
		int[] temp = new int[2];
		arr[0] = Integer.parseInt(br.readLine());
		for(int i=1; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			temp[1] = num+arr[0];
			temp[0] = Math.max(arr[0], Math.max(arr[1], arr[2]));
			arr[0] = num+arr[1];
			arr[1] = temp[0];
			arr[2] = temp[1];
		}
		int max = Math.max(arr[0], arr[2]);
		max = Math.max(max, arr[1]);
		bw.write(max+"");
		bw.close();
		br.close();
	}
}