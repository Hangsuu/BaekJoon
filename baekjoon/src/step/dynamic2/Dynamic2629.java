package step.dynamic2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Dynamic2629 {
	private static int[] weight;
	private static boolean[][] scale;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		weight = new int[n];
		int total = 0;
		for(int i=0; i<n; i++) {
			int temp =Integer.parseInt(st.nextToken()); 
			weight[i] = temp;
			total+=temp;
		}
		scale = new boolean[n+1][total+1];
		dfs(0, 0);
		
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int ball = Integer.parseInt(st2.nextToken());
			if(ball<=total) {
				if(scale[n][ball]) {
					bw.write("Y ");
				}
				else {
					bw.write("N ");
				}
			}
			else {
				bw.write("N ");
			}
		}
		bw.close();
		br.close();
	}
	//추의 무게를 각각 더하거나 빼서 만들 수 있는 무게들을 구해줌
	private static void dfs(int idx, int thisWeight) {
		if(scale[idx][thisWeight]) {
			return;
		}
		scale[idx][thisWeight]=true;
		if(idx==weight.length) return;
		int tempWeight = weight[idx];
		dfs(idx+1, Math.abs(thisWeight-tempWeight));
		dfs(idx+1, thisWeight+tempWeight);
		dfs(idx+1, thisWeight);
	}
}
