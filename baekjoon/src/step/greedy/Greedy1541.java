package step.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Greedy1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split("");
		boolean isMinus=false;
		int sum=0;
		String temp="";
		for(int i=0; i<s.length; i++) {
			if(s[i].equals("+")) {
				if(isMinus) {
					sum-=Integer.parseInt(temp);
					temp="";
				}
				else {
					sum+=Integer.parseInt(temp);
					temp="";
				}
			}
			else if(s[i].equals("-")) {
				if(isMinus) {
					sum-=Integer.parseInt(temp);
					temp="";
				}
				else {
					sum+=Integer.parseInt(temp);
					temp="";
					isMinus=true;
				}
			}
			else {
				temp+=s[i];
			}
			if(i==s.length-1) {
				if(isMinus) {
					sum-=Integer.parseInt(temp);
					temp="";
				}
				else {
					sum+=Integer.parseInt(temp);
					temp="";
				}
			}
		}
		bw.write(sum+"");
		bw.close();
		br.close();
	}
}