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

public class Bfs1753 {
	private static List<List<Element>> list = new ArrayList<List<Element>>();
	private static int[] arr;
	private static PriorityQueue<Element> queue = new PriorityQueue<Element>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] ve = br.readLine().split(" ");
		int v = Integer.parseInt(ve[0]);
		int e = Integer.parseInt(ve[1]);
		
		int k = Integer.parseInt(br.readLine());
		arr = new int[v+1];
		Arrays.fill(arr, Integer.MAX_VALUE);
		for(int i=0; i<=v; i++) {
			list.add(new ArrayList<Element>());
		}
		
		for(int i=0; i<e; i++) {
			String[] st = br.readLine().split(" ");
			int s = Integer.parseInt(st[0]);
			int f = Integer.parseInt(st[1]);
			int w = Integer.parseInt(st[2]);
			
			list.get(s).add(new Element(f, w));
		}
		bfs(k);
		
		for(int i=1; i<=v; i++) {
			if(arr[i]==Integer.MAX_VALUE) {
				bw.write("INF\n");
			}
			else {
				bw.write(arr[i]+"\n");
			}
		}
		bw.close();
		br.close();
	}
	private static void bfs(int start) {
        arr[start] = 0;
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
