package step.geo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Geo4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] s = br.readLine().split(" ");
			int[] arr = new int[3];
			arr[0] = Integer.parseInt(s[0]);
			arr[1] = Integer.parseInt(s[1]);
			arr[2] = Integer.parseInt(s[2]);
			if(arr[0]==0) break;
			Arrays.sort(arr);
			if(Math.pow(arr[0], 2)+Math.pow(arr[1], 2)==Math.pow(arr[2], 2)) bw.write("right\n");
			else bw.write("wrong\n");
		}
		bw.close();
		br.close();
	}
}