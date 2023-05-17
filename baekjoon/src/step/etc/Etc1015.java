package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Etc1015 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[][] arr = new int[n][3];
		for(int i=0; i<n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			arr[i][0] = temp;
			arr[i][2] = i;
		}
		Comparator<int[]> c1 = new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return o1[0]-o2[0];
		    }
		};
		Comparator<int[]> c2 = new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return o1[2]-o2[2];
		    }
		};
		Arrays.sort(arr, c1);
		for(int i=0; i<n; i++) {
			arr[i][1]=i;
		}
		Arrays.sort(arr,c2);
		for(int i=0; i<n; i++) {
			bw.write(arr[i][1]+" ");
		}
		bw.close();
		br.close();
		
	}
}
