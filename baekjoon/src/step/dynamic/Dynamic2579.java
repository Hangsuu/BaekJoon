package step.dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Dynamic2579 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] step = new int[3];
		int[] temp = new int[3];
		step[1] = Integer.parseInt(br.readLine());
		for(int i=1; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			temp[2]=Math.max(step[0], step[1]);//두칸가려고 쉬는자리
			temp[0] = step[1]+num;	//두칸 간애를 바로 한칸
			temp[1] = step[2]+num;	//쉬었던 애를 한칸
			
			step[0]=temp[0];//한칸 간 자리
			step[1]=temp[1];//두칸자리
			step[2]=temp[2];
		}
		int max=Math.max(step[0], step[1]);
		bw.write(max+"");
		bw.close();
		br.close();
	}
}