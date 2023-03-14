package step.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Greedy13305 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer distance = new StringTokenizer(br.readLine());
		StringTokenizer price = new StringTokenizer(br.readLine());
		int min = Integer.parseInt(price.nextToken());
		long sum=0L;
		for(int i=0; i<n-1; i++) {
			sum+=(long) min*Integer.parseInt(distance.nextToken());
			min = Math.min(min, Integer.parseInt(price.nextToken()));
		}
		bw.write(sum+"");
		bw.close();
		br.close();
	}
}