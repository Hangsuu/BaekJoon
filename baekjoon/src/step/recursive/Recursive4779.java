package step.recursive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Recursive4779 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String temp="";
		while((temp=br.readLine())!=null) {
			int n = Integer.parseInt(temp);
			bw.write(kant("-", n)+"\n");
		}
		
		bw.close();
		br.close();
	}
	private static String kant(String s, int n) {
		if(n==0) {
			return s;
		}
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		String space = " ".repeat(s.length());
		sb.append(space);
		sb.append(s);
		return kant(sb.toString(), n-1);
	}
}
