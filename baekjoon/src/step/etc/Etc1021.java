package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Etc1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] first = new int[n];
		Integer[] second = new Integer[n];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		for(int i=0; i<n; i++) {
			first[i] = Integer.parseInt(st1.nextToken());
			second[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(first);
		Arrays.sort(second, (Integer a, Integer b)-> b-a);
		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=first[i]*second[i];
		}
		bw.write(sum+"");
		bw.close();
		br.close();
	}
}
