package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs24445 {
	private static int index=2;
	private static int[] ans;
	private static ArrayList<ArrayList<Integer>> bfs = new ArrayList<>();;
	private static int n;
	private static int m;
	private static int r;
	private static Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		r = Integer.parseInt(s[2]);
		ans = new int[n+1];
		for(int i=0; i<=n; i++) {
			bfs.add(new ArrayList<>());
		}
		for(int t=0; t<m; t++) {
			String[] s2 = br.readLine().split(" ");
			int x = Integer.parseInt(s2[0]);
			int y = Integer.parseInt(s2[1]);
			bfs.get(x).add(y);
			bfs.get(y).add(x);
		}
		for(int i=1; i<=n; i++) {
			Collections.sort(bfs.get(i), (a,b)->b-a);
		}
		
		
		ans[r]=1;
		for(int i=0; i<bfs.get(r).size(); i++) {
			int temp = bfs.get(r).get(i);
			queue.add(temp);
		}
		while(queue.size()>0) {
			int size = queue.size();
			for(int i=0; i<size; i++) {
				int temp = queue.poll();
				if(ans[temp]==0) {
					ans[temp]=index;
					index++;
					for(int j=0; j<bfs.get(temp).size(); j++) {
						queue.add(bfs.get(temp).get(j));
					}
				}
			}
		}
		for(int i=1; i<=n; i++) {
			bw.write(ans[i]+"\n");
		}
		bw.close();
		br.close();
	}
}
