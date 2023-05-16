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

public class Bfs16928 {
	private static Queue<Integer> queue = new LinkedList<Integer>();
	private static Map<Integer, Integer> map = new HashMap<>();
	private static boolean[] arr = new boolean[101];
	private static int count=0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		for(int i=0; i<n+m; i++) {
			String[] temp = br.readLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			map.put(x, y);
		}
		riding(1);
		bfs();
		
		bw.write(count+"");
		bw.close();
		br.close();
	}
	private static void bfs() {
		int size = queue.size();
		if(size==0 || map.containsKey(1) && map.get(1)==100) return;
		count++;
		for(int i=0; i<size; i++) {
			int poll = queue.poll();
			for(int j=1; j<=6; j++) {
				int temp = poll+j;
				if(temp==100) return;
				if(temp<=100 && !arr[temp]) {
					riding(temp);
					if(arr[100]) return;
				}
			}
		}
		bfs();
	}
	private static void riding(int n) {
		arr[n]=true;
		if(map.containsKey(n)) {
			int temp=map.get(n);
			arr[temp]=true;
			riding(temp);
		}
		else {
			queue.add(n);
			return;
		}
	}
}