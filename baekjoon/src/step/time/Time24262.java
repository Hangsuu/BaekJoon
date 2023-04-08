package step.time;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Time24262 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int[] arr = new int[] {Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2])};
		Arrays.sort(arr);
		if(arr[2]<arr[0]+arr[1]) {
			bw.write(arr[0]+arr[1]+arr[2]+"");
		}
		else {
			bw.write(arr[0]*2+arr[1]*2-1+"");
		}
		bw.close();
		br.close();
	}
}
