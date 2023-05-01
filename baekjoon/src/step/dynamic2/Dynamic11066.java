package step.dynamic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Dynamic11066 {
	static long[] arr = new long[101];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			PriorityQueue<Integer> heap = new PriorityQueue<>();

			for(int j=0; j<n; j++) {
				heap.add(Integer.parseInt(st.nextToken()));
			}
			int sum=0;
			
			while(heap.size()>1) {
				int temp = heap.poll()+heap.poll();
				sum+=temp;
				heap.add(temp);
				System.out.println(temp+", "+sum);
			}
			bw.write(sum+"\n");
		}
		bw.close();
		br.close();
	}
}