package step.back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Back14888 {
	static int n;
	static int[] math = new int[4];
	static int[] num;
	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		num = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			math[i] = Integer.parseInt(st2.nextToken());
		}
		back(num[0], 0);
		Collections.sort(list);
		bw.write(list.get(list.size()-1)+"\n"+list.get(0));
		bw.close();
		br.close();
	}
	static void back(int ans, int depth) {
		if(depth==n-1) {
			list.add(ans);
			return;
		}
		for(int i=0; i<4; i++) {
			if(math[i]!=0) {
				math[i]--;
				int temp = result(ans, num[depth+1], i);
				back(temp, depth+1);
				math[i]++;
			}
		}
	}
	
	static int result(int a, int b, int n) {
		if(n==0) {
			return a+b;
		}
		else if(n==1) {
			return a-b;
		}
		else if(n==2) {
			return a*b;
		}
		else {
			if(a<0) {
				return (a*(-1)/b)*(-1);
			}
			else return a/b;
		}
	}
}