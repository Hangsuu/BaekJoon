package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Bfs1753 {
	private static Map<Integer, Integer> map = new HashMap<>();
	private static Integer[] arr;
	private static Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] ve = br.readLine().split(" ");
		int v = Integer.parseInt(ve[0]);
		int e = Integer.parseInt(ve[1]);
		
		int k = Integer.parseInt(br.readLine());
		
		arr = new Integer[v+1];
		for(int i=0; i<e; i++) {
			String[] st = br.readLine().split(" ");
			int s = Integer.parseInt(st[0]);
			int f = Integer.parseInt(st[1]);
			int w = Integer.parseInt(st[2]);
			
		}
		arr[k]=0;
		queue.add(k);
		bfs();
	}
	private static void bfs() {
		int size = queue.size();
	}
}
