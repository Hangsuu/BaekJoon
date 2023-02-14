package step.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number9375 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			Map<String, Integer> map = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			for(int j=0; j<n; j++) {
				String[] s = br.readLine().split(" ");
				String key = s[1];
				if(map.containsKey(key)) map.put(key, map.get(key)+1);
				else map.put(key, 1);
			}
			List<String> list = new ArrayList<>(map.keySet());
			int ans = 1;
			for(String s : list) {
				ans *= (map.get(s)+1);
			}
			bw.write(ans-1+"\n");
		}
		bw.close();
		br.close();
	}
}