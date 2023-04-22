package step.divide;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Divide6549 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if(n==0) {
				break;
			}
			int[] arr = new int[n];
			for (int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			long max=0L;
			Stack<Integer> stack  = new Stack<>();
			for(int i=0; i<n; i++) {
				while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]) {
					int temp = arr[stack.pop()];
					int width = stack.isEmpty()? i: i-1-stack.peek();
					max = Math.max(max, (long)temp*(long)width);
				}
				stack.push(i);
			}
			
			while(!stack.isEmpty()) {
				int temp = arr[stack.pop()];
				int width = stack.isEmpty()? n:n-1-stack.peek();
				max = Math.max(max, (long)temp * (long) width);
			}
			bw.write(max+"\n");
		}
		bw.close();
		br.close();
	}
}