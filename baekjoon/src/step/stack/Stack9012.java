package step.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			int m=0;
			Stack<String> stack = new Stack<>();
			String[] s = br.readLine().split("");
			if(s.length==1 && s[0].equals(".")) break;
			for(int j=0; j<s.length; j++) {
				switch(s[j]) {
				case "(" : stack.push("(");
					break;
				case "[" : stack.push("[");
					break;
				case ")" :
					if(stack.size()>0 && stack.pop().equals("(")) {
					}
					else {
						m++;
						j=s.length;
					}
					break;
				case "]" :
					if(stack.size()>0 && stack.pop().equals("[")) {
					}
					else {
						m++;
						j=s.length;
					}
					break;
				default : 
				}
			}
			if(m==0 && stack.size()==0) {
				bw.write("yes\n");
			}
			else {
				bw.write("no\n");
			}
		}
		bw.close();
		br.close();
	}
}