package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Dfs2606 {
	private static boolean[] arr;
	private static List<ArrayList<Integer>> dfs = new ArrayList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());
		arr = new boolean[n+1];
		for(int i=0; i<n+1; i++) {
			dfs.add(new ArrayList<>());
		}
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			dfs.get(x).add(y);
			dfs.get(y).add(x);
		}
		dfs(1);
		int count=0;
		for(int i=2; i<=n; i++) {
			if(arr[i]) {
				count++;
			}
		}
		bw.write(count+"");
		bw.close();
		br.close();
	}
	private static void dfs(int k) {
		for(int i=0; i<dfs.get(k).size(); i++) {
			int temp = dfs.get(k).get(i);
			if(!arr[temp]) {
				arr[temp]=true;
				dfs(temp);
			}
		}
	}
}
