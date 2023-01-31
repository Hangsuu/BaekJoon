package step.array2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Array10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][3];
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			arr[i][0] = s[0];
			arr[i][1] = s[1];
			arr[i][2] = i+"";
		}
		Comparator<String[]> c = new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(Integer.parseInt(o1[0])!=Integer.parseInt(o2[0])) return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
				else return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]); 
			}
		};
		Arrays.sort(arr, c);
		for(int i=0; i<n; i++) {
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		}
		br.close();
		bw.close();
	}
}