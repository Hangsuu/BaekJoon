package step.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number1934 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int commonNum = common(a, b);
			bw.write(a*b/commonNum+"\n");
		}
		bw.close();
		br.close();
	}
	
	public static int common(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		if(max%min==0) return min;
		else return common(min, max%min);
	}
}