package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic9184 {
	static Integer[][][] arr = new Integer[21][21][21];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int c = Integer.parseInt(s[2]);
			if(a==-1 && b==-1 && c==-1) break;
			
			int ans = w(a, b, c);
			bw.write("w("+a+", "+b+", "+c+") = "+ans+"\n");
		}
		bw.close();
		br.close();
	}
	
	static int w(int a, int b, int c) {
		if(a<=0 || b<=0 || c<=0) return 1;
		if(a>20 || b>20 || c>20) {
			if(arr[20][20][20]==null) {
				return w(20, 20, 20);
			}
			else return arr[20][20][20];
		}
		if(a<b && b<c) {
			if(arr[a][b][c-1]==null) arr[a][b][c-1] = w(a, b, c-1);
			if(arr[a][b-1][c-1]==null) arr[a][b-1][c-1]=w(a, b-1, c-1);
			if(arr[a][b-1][c]==null) arr[a][b-1][c]=w(a, b-1, c);
			return arr[a][b][c-1]+arr[a][b-1][c-1]-arr[a][b-1][c];
		}
		else {
			if(arr[a-1][b][c]==null) arr[a-1][b][c]=w(a-1, b, c);
			if(arr[a-1][b-1][c]==null) arr[a-1][b-1][c]=w(a-1, b-1, c);
			if(arr[a-1][b][c-1]==null ) arr[a-1][b][c-1]=w(a-1, b, c-1);
			if(arr[a-1][b-1][c-1]==null) arr[a-1][b-1][c-1]=w(a-1,b-1,c-1);
			return arr[a-1][b][c]+arr[a-1][b-1][c]+arr[a-1][b][c-1]-arr[a-1][b-1][c-1];
		}
	}
}
