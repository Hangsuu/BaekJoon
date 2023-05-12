package step.number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Number2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				list.add(i);
			}
		}
		if(k<=list.size()) {
			bw.write(list.get(k-1)+"");
		}
		else {
			bw.write("0");
		}
		bw.close();
		br.close();
	}
}
