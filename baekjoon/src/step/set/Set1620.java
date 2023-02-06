package step.set;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Set1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		Map<String, String>map = new HashMap<>();
		Map<String, String>map2 = new HashMap<>();
		for(int i=1; i<=n; i++) {
			String temp=br.readLine();
			map.put(temp, i+"");
			map2.put(i+"", temp);
		}
		for(int i=0; i<m; i++) {
			String temp = br.readLine();
			if(map.containsKey(temp)) bw.write(map.get(temp)+"\n");
			else bw.write(map2.get(temp)+"\n");
		}
		bw.close();
		br.close();
	}
}