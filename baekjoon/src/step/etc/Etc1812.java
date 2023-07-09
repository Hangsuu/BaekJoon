package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Etc1812 {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] sum = new int[n];
        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
        	sum[i] = Integer.parseInt(br.readLine());
        }
        int num = 0;
        while(true) {
        	ans[0]=num; 
        	for(int i=1; i<n; i++) {
        		ans[i]=sum[i-1]-ans[i-1];
        	}
        	if(ans[n-1]+ans[0]==sum[n-1]) {
        		break;
        	}
        	else {
        		num++;
        	}
        }
        for(int i:ans) {
        	bw.write(i+"\n");
        }
        bw.close();
        br.close();
	}
}
