package step.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test = Integer.parseInt(br.readLine());
		for(int i=0; i<test; i++) {
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			Queue<Integer> queue = new LinkedList<Integer>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num=0;
			int max=0; 
			for(int j=0; j<n; j++) {
				int temp = Integer.parseInt(st.nextToken());
				max=Math.max(max, temp);
				if(j==m) {
					queue.add(0);
					num=temp;
				}
				else queue.add(temp);
			}
			int count=0;
			while(num<max) {
				for(int j=0; j<queue.size(); j++) {
					int tempNum = queue.poll();
					if(tempNum==max) {
						count++;
					}
					else {
						queue.add(tempNum);
					}
				}
				max=0;
				for(int j=0; j<queue.size(); j++) {
					int tempNum = queue.poll();
					max = Math.max(max, tempNum);
					queue.add(tempNum);
				}
			}
			while(queue.peek()!=0) {
				if(queue.peek()==max) {
					queue.poll();
					count++;
				}
				else {
					queue.add(queue.poll());
				}
			}
			count++;
			bw.write(count+"\n");
		}
		bw.close();
		br.close();
	}
}