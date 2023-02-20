package step.back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Back9663 {
	static int[] arr;
	static int n;
	static int count=0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		queen(0);
		bw.write(count+"");
		br.close();
		bw.close();
	}
	
	static void queen(int depth) {
		if(depth==n) {
			count++;
			return;
		}
		for(int i=0; i<n; i++) {
			arr[depth] = i;
			if(cross(depth)) {
				queen(depth+1);
			}
		}
	}
	
	static boolean cross(int row) {
		for(int i=0; i<row; i++) {
			if(arr[i]==arr[row]) return false;
			else if(Math.abs(row-i)==Math.abs(arr[row]-arr[i])) return false;
		}
		return true;
	}
}