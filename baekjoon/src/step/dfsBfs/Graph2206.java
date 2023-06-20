package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Graph2206 {
	private static boolean[][] miro;
	private static int[][] cost;
	private static int[][] drillCost;
	private static int n;
	private static int m;
	private static int[] moveX = {1, -1, 0, 0};
	private static int[] moveY = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		miro = new boolean[n+2][m+2];
		cost = new int[n+2][m+2];
		drillCost = new int[n+2][m+2];
		for(int i=0; i<n; i++) {
			String temp = br.readLine();
			for(int j=0; j<m; j++) {
				if(temp.charAt(j)=='0') {
					miro[i+1][j+1]=true;
				}
			}
		}
		bfs();
		if(cost[n][m]==0 && drillCost[n][m]==0) {
			bw.write("-1");
		}
		else {
			int a = cost[n][m];
			int b = drillCost[n][m];
			if(a==0) {
				a = Integer.MAX_VALUE;
			}
			if(b==0) {
				b = Integer.MAX_VALUE;
			}
			int min = Math.min(a,b);
			bw.write(min+"");
		}
		bw.close();
		br.close();
	}
	private static void bfs() {
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(1, 1, 1, false));
		while(!queue.isEmpty()) {
			Point temp = queue.poll();
			if(n==1 && m==1) {
				cost[1][1]=1;
				break;
			}
			if(temp.x==n && temp.y==m) {
				break;
			}
			
			for(int i=0; i<4; i++) {
				int xm = temp.x+moveX[i];
				int ym = temp.y+moveY[i];
				if(xm<=0 || xm>n || ym<=0 || ym>m) {
					continue;
				}
				int next = cost[xm][ym];
				int drillNext = drillCost[xm][ym];
				if(miro[xm][ym]) {
					if(!temp.drill) {
						if(next==0 || next>temp.point+1) {
							cost[xm][ym]=temp.point+1;
							queue.add(new Point(xm, ym, temp.point+1, temp.drill));
						}
					}
					else {
						if(drillNext==0 || drillNext>temp.point+1) {
							drillCost[xm][ym]=temp.point+1;
							queue.add(new Point(xm, ym, temp.point+1, temp.drill));
						}
					}
				}
				else {
					if(!temp.drill&& (next==0 || next>temp.point+1)) {
						drillCost[xm][ym]=temp.point+1;
						queue.add(new Point(xm, ym, temp.point+1, true));
					}
				}
			}
		}
	}
	private static class Point {
		private int x;
		private int y;
		private int point;
		private boolean drill;
		
		public Point(int x, int y, int point, boolean drill) {
			this.x = x;
			this.y = y;
			this.point = point;
			this.drill = drill;
		}
	}
}
