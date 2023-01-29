package step.array2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int col = 0;
		int row = 0;
		int max = 0;
		for(int i=0; i<9; i++) {
			String[] s = br.readLine().split(" ");
			for(int j=0; j<9; j++) {
				if(max<=Integer.parseInt(s[j])) {
					max = Integer.parseInt(s[j]);
					col=i+1;
					row=j+1;
				}
			}
		}
		bw.write(max+"\n"+col+" "+row);
		bw.close();
		br.close();
	}
}