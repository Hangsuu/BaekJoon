package step.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreElements()) {
				String temp = st.nextToken();
				if(temp.equals("(")){
					stack.push(1);
				}
				else {
					if(stack.size()==0) {
						stack.push(1);
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			if(stack.size()==0) {
				bw.write("YES\n");
			}
			else {
				bw.write("NO\n");
			}
		}
		bw.close();
		br.close();
	}
}