package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count=0;
		int num=0;
		while(true) {
			if(n>num) {
				n-=num;
				count++;
				num++;
			}
			else if(n<num) {
				num=1;
			}
			else {
				break;
			}
		}
		bw.write(count+"");
		bw.close();
		br.close();
	}
}
