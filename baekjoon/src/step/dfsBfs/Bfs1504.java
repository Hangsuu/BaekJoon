package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Bfs1504 {
	private static List<List<Element>> list = new ArrayList<List<Element>>();
	private static PriorityQueue<Element> queue = new PriorityQueue<Element>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] ve = br.readLine().split(" ");
		int v = Integer.parseInt(ve[0]);
		int e = Integer.parseInt(ve[1]);
		
		int[] arr1 = new int[v+1];
		int[] arr2 = new int[v+1];
		int[] arr3 = new int[v+1];
		Arrays.fill(arr1, Integer.MAX_VALUE);
		Arrays.fill(arr2, Integer.MAX_VALUE);
		Arrays.fill(arr3, Integer.MAX_VALUE);
		
		for(int i=0; i<=v; i++) {
			list.add(new ArrayList<Element>());
		}
		
		for(int i=0; i<e; i++) {
			String[] st = br.readLine().split(" ");
			int s = Integer.parseInt(st[0]);
			int f = Integer.parseInt(st[1]);
			int w = Integer.parseInt(st[2]);
			
			list.get(s).add(new Element(f, w));
			list.get(f).add(new Element(s, w));
		}
		
		String[] vv = br.readLine().split(" ");
		int v1 = Integer.parseInt(vv[0]);
		int v2 = Integer.parseInt(vv[1]);
		
		bfs(1, arr1);
		bfs(v1, arr2);
		bfs(v2, arr3);
		int r1 = Integer.MAX_VALUE;
		int r2 = Integer.MAX_VALUE;
		if(arr1[v1]!=Integer.MAX_VALUE && arr2[v2]!=Integer.MAX_VALUE && arr3[v]!=Integer.MAX_VALUE) {
			r1 = arr1[v1]+arr2[v2]+arr3[v];
		}
		if(arr1[v2]!=Integer.MAX_VALUE && arr2[v]!=Integer.MAX_VALUE && arr3[v1]!=Integer.MAX_VALUE) {
			r2 = arr1[v2]+arr3[v1]+arr2[v];
		}
		
		int min = Math.min(r1, r2);
		if(min==Integer.MAX_VALUE) {
			bw.write("-1");
		}
		else {
			bw.write(min+"");
		}
		bw.close();
		br.close();
	}
	private static void bfs(int start, int[] arr) {
		arr[start]=0;
        queue.offer(new Element(start, 0));
        
        while(!queue.isEmpty()) {
            Element cur = queue.poll();
            int curIndex = cur.end;
            int curCost = cur.cost;
            
            if(arr[curIndex] < curCost) {
                continue;
            }
            
            for(Element next : list.get(curIndex)) {
                int nextIndex = next.end;
                int nextCost = next.cost;
                
                if(arr[nextIndex] > arr[curIndex] + nextCost) {
                    arr[nextIndex] = arr[curIndex] + nextCost;
                    queue.offer(new Element(nextIndex, arr[nextIndex]));
                }
            }
        }
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
