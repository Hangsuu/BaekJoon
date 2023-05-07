package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Dfs1260 {
	private static List<ArrayList<Integer>> arr = new ArrayList<>();
	private static List<Integer> dfsAns = new ArrayList<>();
	private static List<Integer> bfsAns = new ArrayList<>();
	private static Queue<Integer> queue = new LinkedList<Integer>();
	private static boolean[] dfs;
	private static boolean[] bfs;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int v = Integer.parseInt(s[2]);
		dfs = new boolean[n+1];
		bfs = new boolean[n+1];
		for(int i=0; i<n+1; i++){
			arr.add(new ArrayList<>());
		}
		for(int i=0; i<m; i++) {
			String[] s0 = br.readLine().split(" ");
			int x = Integer.parseInt(s0[0]);
			int y = Integer.parseInt(s0[1]);
			arr.get(x).add(y);
			arr.get(y).add(x);
		}
		for(int i=1; i<n+1; i++) {
			Collections.sort(arr.get(i));
		}
		queue.add(v);
		bfsAns.add(v);
		bfs[v]=true;
		dfs(v);
		bfs();
		for(int i : dfsAns) {
			bw.write(i + " ");
		}
		bw.write("\n");
		for(int i : bfsAns) {
			bw.write(i + " ");
		}
		bw.close();
		br.close();
		
	}
	
	private static void dfs(int v) {
		if(dfs[v]) {
			return;
		}
		else {
			dfs[v]=true;
			dfsAns.add(v);
			for(int i=0; i<arr.get(v).size(); i++) {
				int temp = arr.get(v).get(i);
				dfs(temp);
			}
		}
	}
	private static void bfs() {
		int temp = queue.size();
		for(int i=0; i<temp; i++) {
			int poll=queue.poll();
			for(int j=0; j<arr.get(poll).size(); j++) {
				int num = arr.get(poll).get(j);
				if(!bfs[num]) {
					queue.add(num);
					bfsAns.add(num);
					bfs[num]=true;
				}
			}
		}
		if(queue.size()!=0) bfs();
	}
}
