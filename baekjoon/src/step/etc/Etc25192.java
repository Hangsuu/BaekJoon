package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Etc25192 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int count=0;
		for(int i=0; i<n; i++) {
			String temp = br.readLine();
			if(temp.equals("ENTER")) {
				count += set.size();
				set = new HashSet<>();
			}
			else {
				set.add(temp);
			}
		}
		count+=set.size();
		bw.write(count+"");
		bw.close();
		br.close();
	}
}
