package step.etc;

import java.io.*;

public class Etc1668 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int left = 0;
        int leftMax = 0;
        int right = 0;
        int rightMax = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>leftMax){
                left++;
                leftMax=arr[i];
            }
            if(arr[n-i-1]>rightMax){
                right++;
                rightMax=arr[n-i-1];
            }
        }
        bw.write(left+"\n"+right);
        bw.close();
        br.close();
    }
}
