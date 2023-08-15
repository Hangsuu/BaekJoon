package step.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class Brute19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[6];
        for(int i=0; i<6; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=-999; i<=999; i++){
            for(int j=-999; j<=999; j++){
                boolean first = arr[0]*i + arr[1]*j == arr[2];
                boolean second = arr[3]*i + arr[4]*j ==arr[5];
                if(first && second){
                    bw.write(i+" "+j);
                    i=1000;
                    j=1000;
                }
            }
        }
        bw.close();
        br.close();
    }
}
