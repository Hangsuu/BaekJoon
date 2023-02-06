package step.set;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Set1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		Set<String> set1 = new TreeSet<>();
		Set<String> set2 = new TreeSet<>();
		for(int i=0; i<n; i++) set1.add(br.readLine());
		for(int i=0; i<m; i++) set2.add(br.readLine());
		set1.retainAll(set2);
		ArrayList<String> arr = new ArrayList<>(set1);
		bw.write(arr.size()+"\n");
		for(String word : arr) bw.write(word+"\n");
		bw.close();
		br.close();
	}
}