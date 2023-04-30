package step.heap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Heap11279 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(br.readLine());
			if(temp==0) {
				if(maxHeap.size()==0) {
					bw.write("0\n");
				}
				else {
					bw.write(maxHeap.poll()+"\n");
				}
			}
			else {
				maxHeap.add(temp);
			}
		}
		bw.close();
		br.close();
	}
}
