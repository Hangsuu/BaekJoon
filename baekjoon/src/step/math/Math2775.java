package step.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			long up = 1L;
			long down = 1L;
			for(int j=k+2; j<=k+n; j++) up *= j;
			for(int j=1; j<=n-1; j++) down *= j;
			long p = up / down;
			bw.write(p+"\n");
		}
		br.close();
		bw.close();
	}
}