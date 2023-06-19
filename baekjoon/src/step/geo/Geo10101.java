package step.geo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Geo10101 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum=0;
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<3; i++) {
			int temp = Integer.parseInt(br.readLine());
			sum+=temp;
			set.add(temp);
		}
		if(sum!=180) {
			bw.write("Error");
		}
		else {
			if(set.size()==1){
				bw.write("Equilateral");
			}
			else if(set.size()==2) {
				bw.write("Isosceles");
			}
			else {
				bw.write("Scalene");
			}
		}
		bw.close();
		br.close();
	}
}
