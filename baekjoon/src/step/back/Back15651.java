package step.back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back15651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int[] arr = new int[m];
		for(int i=0; i<m; i++) {
			arr[i] = 1;
		}
		for(int j=0; j<Math.pow(n, m); j++) {
			int temp = j;
			int idx = m-1;
			while(temp>=1) {
				arr[idx]=temp%n+1;
				idx--;
				temp /= n;
			}
			for(int l=0; l<m; l++) {
				bw.write(arr[l]+" ");
			}
			bw.write("\n");
		}
		bw.close();
		br.close();
	}
}