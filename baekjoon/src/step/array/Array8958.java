package step.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split("");
			int combo = 0;
			int score = 0;
			for(int j=0; j<s.length; j++) {
				if(s[j].equals("O")) {
					combo++;
					score += combo;
				}
				else combo=0;
			}
			System.out.println(score);
		}
	}
}