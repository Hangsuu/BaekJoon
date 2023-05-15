package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs7569 {
	private static int m;
	private static int n;
	private static int h;
	private static int[][][] arr;
	private static Queue<Integer> x = new LinkedList<Integer>();
	private static Queue<Integer> y = new LinkedList<Integer>();
	private static Queue<Integer> z = new LinkedList<Integer>();
	private static int ans=0;
	private static int count;
	private static int[] moveX = {-1, 1, 0, 0, 0, 0};
	private static int[] moveY = {0, 0, -1, 1, 0, 0};
	private static int[] moveZ = {0, 0, 0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		m = Integer.parseInt(s[0]);
		n = Integer.parseInt(s[1]);
		h = Integer.parseInt(s[2]);
		arr = new int[n][m][h];
		count=n*m*h;
		for(int k=0; k<h; k++) {
			for(int i=0; i<n; i++) {
				String[] num = br.readLine().split(" ");
				for(int j=0; j<m; j++) {
					int temp = Integer.parseInt(num[j]);
					arr[i][j][k] = temp;
					if(temp==-1) {
						count--;
					}
					if(temp==1) {
						count--;
						x.add(i);
						y.add(j);
						z.add(k);
					}
				}
			}
		}
		bfs();
		if(count!=0) {
			bw.write("-1");
		}
		else {
			bw.write(ans+"");
		}
		bw.close();
		br.close();
	}
	private static void bfs() {
		int size = x.size();
		if(size==0 || count==0) return;
		ans++;
		for(int i=0; i<size; i++) {
			int tempX = x.poll();
			int tempY = y.poll();
			int tempZ = z.poll();
			for(int j=0; j<6; j++) {
				int newX = tempX+moveX[j];
				int newY = tempY+moveY[j];
				int newZ = tempZ+moveZ[j];
				if(newX>=0 && newX<n && newY>=0 && newY<m && newZ>=0 && newZ<h) {
					if(arr[newX][newY][newZ]==0) {
						x.add(newX);
						y.add(newY);
						z.add(newZ);
						arr[newX][newY][newZ]=1;
						count--;
					}
				}
			}
		}
		bfs();
	}
}
