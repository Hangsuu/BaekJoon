package step.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Math9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();
		int t = Integer.parseInt(br.readLine());
		int maxnum=0;
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			list.add(n);
			if(maxnum<n) maxnum=n;
		}

		ArrayList<Integer> prime = new ArrayList<>();
		prime.add(2);
		if(maxnum>=3) {
			for(int j=3; j<=maxnum; j++) {
				for(int i=0; i<maxnum; i++) {
					if(j%prime.get(i)==0) {
						break;
					}
					if(prime.get(i)>Math.sqrt(j)) {
						prime.add(j);
						break;
					}
				}
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			int n = list.get(i);
			int idx = 0;
			while(true) {
				if(n/2>prime.get(idx)) idx++;
				else break;
			}
			int count=0;
			while(count !=1) {
				int a=prime.get(idx);
				for(int j=idx; j>=0; j--) {
					if(a+prime.get(j)==n) {
						sb.append(prime.get(j)+" "+a+"\n");
						count++;
					}
					if(a+prime.get(j)<n) break;
				}
				idx++;
			}
		}
		System.out.println(sb.toString());
		br.close();
		bw.close();
	}
}