package step.set;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Set14425 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		Set<String> set = new HashSet<>();
		for(int i=0; i<n; i++) {
			set.add(br.readLine());
		}
		int count=0;
		for(int i=0; i<m; i++) {
			if(set.contains(br.readLine())) count++;
		}
		bw.write(count+"");
		bw.close();
		br.close();
	}
}