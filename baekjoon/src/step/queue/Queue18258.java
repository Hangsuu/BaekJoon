package step.queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Queue18258 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		int last=0;
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			switch(s[0]) {
			case "push":
				last = Integer.parseInt(s[1]);
				queue.add(last);
				break;
			case "pop":
				if(queue.size()>0) bw.write(queue.poll()+"\n");
				else bw.write(-1+"\n");
				break;
			case "size":
				bw.write(queue.size()+"\n");
				break;
			case "empty":
				if(queue.isEmpty()) bw.write(1+"\n");
				else bw.write(0+"\n");
				break;
			case "front":
				if(queue.size()>0) bw.write(queue.peek()+"\n");
				else bw.write(-1+"\n");
				break;
			default:
				if(!queue.isEmpty()) bw.write(last+"\n");
				else bw.write(-1+"\n");
			}

		}
		bw.close();
		br.close();
	}
}
