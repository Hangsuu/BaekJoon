package step.dijkstra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijk1956 {
	private static List<List<Element>> list = new ArrayList<List<Element>>();
	private static int[] arr;
	private static int v;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		v = Integer.parseInt(s[0]);
		int e = Integer.parseInt(s[1]);
		arr = new int[v+1];
		Arrays.fill(arr, Integer.MAX_VALUE);
		for(int i=0; i<=v; i++) {
			list.add(new ArrayList<Element>());
		}
		for(int i=0; i<e; i++) {
			String[] s1 = br.readLine().split(" ");
			int a = Integer.parseInt(s1[0]);
			int b = Integer.parseInt(s1[1]);
			int c = Integer.parseInt(s1[2]);
			list.get(a).add(new Element(b, c));
		}
		for(int i=1; i<=v; i++) {
			PriorityQueue<Element> queue = new PriorityQueue<Element>();
			route(queue, i);
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=1; i<=v; i++) {
			min = Math.min(min, arr[i]);
		}
		if(min==Integer.MAX_VALUE) {
			bw.write("-1");
		}
		else {
			bw.write(min+"");
		}
		bw.close();
		br.close();
	}
	
	private static void route(PriorityQueue<Element> queue, int i) {
		int[] costArr = new int[v+1];
		Arrays.fill(costArr, Integer.MAX_VALUE);
		queue.offer(new Element(i, 0));
		
		while(!queue.isEmpty()) {
			Element temp = queue.poll();
			int tempEnd = temp.end;
			int tempCost = temp.cost;
			
			if(costArr[tempEnd]<tempCost) {
				continue;
			}
			int tempEndCost = costArr[tempEnd];
			if(tempEndCost==Integer.MAX_VALUE) {
				tempEndCost=0;
			}
			for(Element tempEle:list.get(tempEnd)) {
				int tempEleEnd = tempEle.end;
				int tempEleCost = tempEle.cost;
				
				if(costArr[tempEleEnd]>tempEndCost+tempEleCost) {
					costArr[tempEleEnd] = tempEndCost+tempEleCost;
					queue.offer(new Element(tempEleEnd, tempEleCost));
				}
			}
		}
		arr[i] = costArr[i];
	}
	private static class Element implements Comparable<Element>{
		private int end;
		private int cost;
		
		public Element(int end, int cost) {
			this.end = end;
			this.cost = cost;
		} 

		@Override
		public int compareTo(Element o) {
			return this.cost-o.cost;
		}
		
	}
}
