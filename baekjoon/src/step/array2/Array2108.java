package step.array2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
		int sum=0;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum+=arr[i];
			map.put(arr[i], 0);
		}
		Arrays.sort(arr);
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<n; i++) {
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
			if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
		}
		int popular = map.get(arr[0]);
		for(int i=0; i<n; i++) {
			if(popular<map.get(arr[i])) popular = map.get(arr[i]);
		}
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			if(map.get(arr[i])==popular && !(list.contains(arr[i]))) list.add(arr[i]);
		}
		int count = 0;
		if(list.size()>=2) count=1;
		bw.write(Math.round((double) sum/n)+"\n");
		bw.write(arr[n/2]+"\n");
		bw.write(list.get(count)+"\n");
		bw.write((max-min)+"");
		br.close();
		bw.close();
	}
}