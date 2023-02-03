package step.function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Function2447 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count=0;
		while(n!=3) {
			count++;
			n=n/3;
		}
		String s = star("*", 1 ,count);
		bw.write(s);
		bw.close();
	}
	
	public static String star(String s,int n, int c) {
		Scanner sc = new Scanner(s);
		StringBuffer sb = new StringBuffer();
		int i=0;
		String[] temp = new String[n];
		while(sc.hasNextLine()) {
			temp[i] = sc.nextLine();
			i++;
		}
		sc.close();
		for(int j=0; j<temp.length; j++) {
			sb.append(temp[j].repeat(3)+"\n");
		}
		for(int j=0; j<temp.length; j++) {
			sb.append(temp[j]+" ".repeat(temp[j].length())+temp[j]+"\n");
		}
		for(int j=0; j<temp.length; j++) {
			sb.append(temp[j].repeat(3)+"\n");
		}
		if(c==0)return sb.toString();
		else return star(sb.toString(), n*3, c-1);
	}
}