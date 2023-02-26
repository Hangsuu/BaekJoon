package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		arr[1] = 0;
		for(int i=1; i<n; i++) {
			if(i+1<=n && arr[i+1]==0) arr[i+1] = arr[i]+1;
			else arr[i+1] = Math.min(arr[i+1], arr[i]+1);
			if(i*2<=n && arr[2*i]==0) arr[2*i] = arr[i]+1;
			else if(i*2<=n) arr[2*i] = Math.min(arr[2*i], arr[i]+1);
			if(i*3<=n && arr[3*i]==0) arr[3*i] = arr[i]+1;
			else if(i*3<=n) arr[3*i] = Math.min(arr[3*i], arr[i]+1);
		}
		bw.write(arr[n]+"");
		bw.close();
		br.close();
	}
}