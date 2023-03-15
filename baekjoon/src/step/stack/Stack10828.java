package step.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			switch(s[0]) {
			case "push":
				stack.push(Integer.parseInt(s[1]));
				break;
			case "pop":
				if(stack.size()>0) bw.write(stack.pop()+"\n");
				else bw.write(-1+"\n");
				break;
			case "size":
				bw.write(stack.size()+"\n");
				break;
			case "empty":
				if(stack.isEmpty()) bw.write(1+"\n");
				else bw.write(0+"\n");
				break;
			default:
				if(!stack.isEmpty()) bw.write(stack.peek()+"\n");
				else bw.write(-1+"\n");
			}

		}
		bw.close();
		br.close();
	}
}
