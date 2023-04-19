package reference;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		String[][] arr= new String[5][15];
		for(int i=0; i<5; i++) {
			String[] s = br.readLine().split("");
			for(int j=0; j<s.length; j++) {
				arr[i][j]=s[j];
			}
		}
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(arr[j][i]!=null) {
					sb.append(arr[j][i]);
				}
			}
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}