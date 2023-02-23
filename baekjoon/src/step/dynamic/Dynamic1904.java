package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic1904 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int temp1=0;
		int temp2=0;
		int answer=1;
		for(int i=0; i<n; i++) {
			temp1=answer+temp2;
			temp2=answer;
			if(temp1>=15746) temp1%=15746;
			answer=temp1;
		}
		bw.write(temp1+"");
		bw.close();
		br.close();
	}
}