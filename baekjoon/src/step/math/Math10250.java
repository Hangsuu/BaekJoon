package step.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.text.Format;

public class Math10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Format f1 = new DecimalFormat("0");
		Format f2 = new DecimalFormat("00");
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split(" ");
			int h = Integer.parseInt(s[0]);
			int p = Integer.parseInt(s[2]);
			if(p%h==0) bw.write(f1.format(h)+f2.format(p/h)+"\n");
			else bw.write(f1.format(p%h)+f2.format(p/h+1)+"\n");
		}
		br.close();
		bw.close();
	}
}