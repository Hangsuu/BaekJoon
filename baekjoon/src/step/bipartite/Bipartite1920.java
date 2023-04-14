package step.bipartite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bipartite1920 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			set.add(temp);
		}
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int temp = Integer.parseInt(st2.nextToken());
			if(set.contains(temp)) {
				bw.write("1\n");
			}
			else {
				bw.write("0\n");
			}
		}
		bw.close();
		br.close();
	}
}
