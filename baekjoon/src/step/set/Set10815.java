package step.set;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Set10815 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) set.add(Integer.parseInt(st.nextToken()));
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			int num=Integer.parseInt(st2.nextToken());
			if(set.contains(num)) bw.write(1+" ");
			else bw.write(0+" ");
		}
		bw.close();
		br.close();
	}
}