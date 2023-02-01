package step.array2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Array18870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] sort = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sort);
		Map<Integer, Integer> map = new HashMap<>();
		int count=0;
		for(int num : sort) {
			if(!(map.containsKey(num))) {
				map.put(num, count);
				count++;
			}
		}
		
		for(int num : arr) bw.write(map.get(num)+" ");
		
		br.close();
		bw.close();
	}
}