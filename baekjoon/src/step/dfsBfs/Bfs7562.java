package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs7562 {
	private static boolean[][] arr;
	private static Queue<Integer> x;
	private static Queue<Integer> y;
	private static int i;
	private static int fx;
	private static int fy;
	private static int[] moveX = {-2, -1, 1, 2, -2, -1, 1, 2};
	private static int[] moveY = {-1, -2, -2, -1, 1, 2, 2, 1};
	private static int count;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int p=0; p<t; p++) {
			x = new LinkedList<Integer>();
			y = new LinkedList<Integer>();
			i = Integer.parseInt(br.readLine());
			arr = new boolean[i][i];
			String[] s = br.readLine().split(" ");
			String[] f = br.readLine().split(" ");
			int sx = Integer.parseInt(s[0]);
			int sy = Integer.parseInt(s[1]);
			x.add(sx);
			y.add(sy);
			
			fx = Integer.parseInt(f[0]);
			fy = Integer.parseInt(f[1]);
			count=0;
			if(sx!=fx || sy!=fy) {
				bfs();
			}
			
			bw.write(count+"\n");
		}
		bw.close();
		br.close();
	}
	private static void bfs() {
		count++;
		int size = x.size();
		for(int p=0; p<size; p++) {
			int tempX = x.poll();
			int tempY = y.poll();
			for(int j=0; j<8; j++) {
				int calcX = tempX+moveX[j];
				int calcY = tempY+moveY[j];
				if(calcX==fx && calcY==fy) {
					return;
				}
				else if(calcX>=0 && calcX<i && calcY>=0 && calcY<i) {
					if(!arr[calcX][calcY]) {
						arr[calcX][calcY]=true;
						x.add(calcX);
						y.add(calcY);
					}
				}
			}
		}
		bfs();
	}
}
