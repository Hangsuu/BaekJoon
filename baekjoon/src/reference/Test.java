package reference;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count=0;
		int num=1;
		for(int i=0; i<8; i++) {
			String[] temp = br.readLine().split("");
			for(int j=0; j<8; j++) {
				if(num%2==1 && temp[j].equals("F")) {
					count++;
				}
				num++;
			}
			num++;
		}
		bw.write(count+"");
		bw.close();
		br.close();
	}
}