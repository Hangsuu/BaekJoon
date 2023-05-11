package step.dfsBfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs1697 {
	private static boolean[] arr;
	private static Queue<Integer> queue = new LinkedList<Integer>();
	private static int count=0;
	private static int k;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		arr=new boolean[200001];
		queue.add(n);
		arr[n]=true;
		if(n!=k) {
			bfs();
		}
		bw.write(count+"");
		bw.close();
		br.close();
	}
	private static void bfs() {
		count++;
		int size = queue.size();
		for(int i=0; i<size; i++) {
			int temp=queue.poll();
			int minus = temp-1;
			int plus = temp+1;
			int multi = temp*2;
			if(minus==k || plus==k || multi==k) {
				return;
			}
			if(minus>=0 && !arr[minus] ) {
				arr[minus]=true;
				queue.add(minus);
			}
			if(plus<k && !arr[plus]) {
				arr[plus]=true;
				queue.add(plus);
			}
			if(multi<k*2 && !arr[multi]) {
				arr[multi]=true;
				queue.add(multi);
			}
		}
		bfs();
	}
}
