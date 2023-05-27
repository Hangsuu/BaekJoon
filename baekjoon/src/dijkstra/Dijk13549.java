package dijkstra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Dijk13549 {
	private static int count=0;
	private static PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
	private static boolean[] visited = new boolean[100001];
	private static int k;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		queue.offer(new int[] {n,0});
		if(n!=k) {
			dijk();
		}
		
		bw.write(count+"");
		bw.close();
		br.close();
	}
	private static void dijk() {
		while(!queue.isEmpty()) {
			int[] temp = queue.poll();
			int end = temp[0];
			int cost = temp[1];
			visited[end]=true;
			int plus = end+1;
			int minus= end-1;
			if(multi(end, cost)) {
				count=cost;
				break;
			}
			if(plus==k || minus==k) {
				count=cost+1;
				break;
			}
			if(multi(plus, cost+1) || multi(minus, cost+1)) {
				count=cost+1;
				break;
			}
			if(plus<=100000 && !visited[plus]) {
				queue.offer(new int[] {plus, cost+1});
			}
			if(minus>=0 && !visited[minus]) {
				queue.offer(new int[] {minus, cost+1});
			}
		}
	}
	private static boolean multi(int i, int cost) {
		while(i>0 && i<=100000 && i*2<=100000) {
			i*=2;
			if(!visited[i]) {
				visited[i]=true;
				queue.offer(new int[] {i, cost});
			}
			if(i==k) break;
		}
		if(i==k) return true;
		else return false;
	}
}
