package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Etc1551 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		String[] num = br.readLine().split(",");
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<n; i++) {
			queue.add(Integer.parseInt(num[i]));
		}
		for(int i=0; i<k; i++) {
			int size = queue.size();
			int temp=queue.poll();
			for(int j=0; j<size-1; j++) {
				int a = queue.poll();
				queue.add(a-temp);
				temp=a;
			}
		}
		int size = queue.size();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<size; i++) {
			sb.append(queue.poll()+"");
			if(i<size-1) {
				sb.append(",");
			}
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}
