package step.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder builder  = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> num = new Stack<>();
		for(int i=n; i>=1; i--) {
			num.push(i);
		}
		Stack<Integer> arr = new Stack<>();
		arr.push(0);
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(br.readLine());
			while(true) {
				if(temp<arr.peek()) {
					arr.pop();
					builder.append("-\n");
				}
				else if(temp>arr.peek()) {
					if(num.size()==0) {
						builder = new StringBuilder("NO");
						i=n;
						break;
					}
					arr.push(num.pop());
					builder.append("+\n");
				}
				else {
					arr.pop();
					builder.append("-\n");
					break;
				}
			}
		}
		bw.write(builder.toString());
		bw.close();
		br.close();
	}
}