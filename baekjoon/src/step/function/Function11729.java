package step.function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Function11729 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.write(hanoi(n, 1, 1)+"\n"+hanoiTower("1 3", n, 1));
		bw.close();
		br.close();
	}
	public static int hanoi(int n, int a, int b) {
		if(b==n)return a;
		else return hanoi(n, a*2+1, b+1);
	}
	public static String hanoiTower(String s, int n, int b) {
		StringBuilder sb = new StringBuilder();
		if(b==n)	return s;
		else {
			s=s.replace("2", "b");
			s=s.replace("3", "c");
			String temp = s;
			s=s.replace("b", "3");
			s=s.replace("c", "2");
			temp=temp.replace("1", "2");
			temp=temp.replace("b", "1");
			temp=temp.replace("c", "3");
			sb.append(s);
			sb.append("\n1 3\n");
			sb.append(temp);
			return hanoiTower(sb.toString(), n, b+1);
		}
	}
}