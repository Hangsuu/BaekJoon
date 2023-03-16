package step.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(br.readLine());
			if(temp==0) {
				stack.pop();
			}
			else stack.push(temp);
		}
		int sum=0;
		while(stack.size()>0) {
			sum+=stack.pop();
		}
		bw.write(sum+"");
		bw.close();
		br.close();
	}
}