package step.set;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Set1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		for(int i=0; i<n; i++) set1.add(st1.nextToken());
		int count=0;
		for(int i=0; i<m; i++) {
			String word=st2.nextToken(); 
			set2.add(word);
			if(set1.contains(word)) count++;
		}
		bw.write(n+m-count*2+"");
		bw.close();
		br.close();
	}
}