package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Etc5073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			if(a==0 && b==0 && c==0) {
				break;
			}
			int[] arr = {a, b, c};
			Arrays.sort(arr);
			if(arr[2]>=arr[1]+arr[0]) {
				bw.write("Invalid\n");
			}
			else if(arr[2]==arr[1] && arr[1]==arr[0]){
				bw.write("Equilateral\n");
			}
			else if(arr[2]==arr[1] || arr[1]==arr[0] || arr[2]==arr[0]) {
				bw.write("Isosceles\n");
			}
			else {
				bw.write("Scalene\n");
			}
		}
		bw.close();
		br.close();
	}
}
