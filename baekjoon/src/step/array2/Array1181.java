package step.array2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Array1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			if(!(list.contains(s))) list.add(s);
		}
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) return o1.compareTo(o2);
				else return o1.length()-o2.length();
			}
		};
		Collections.sort(list, c);
		for(String s : list) bw.write(s+"\n");
		bw.close();
		br.close();
	}
}