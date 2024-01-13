package step.math;

import java.io.*;

public class Math4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            long n = Long.parseLong(br.readLine());
            boolean isPrime = false;
            if(n <= 2) {
                bw.write(2+"\n");
                isPrime = true;
            }
            while(!isPrime) {
                boolean findPrime = true;
                for(long j=2L; j<Math.sqrt(n)+1; j++) {
                    if(n % j == 0) {
                        n ++;
                        findPrime = false;
                        break;
                    }
                }
                if(findPrime) {
                    isPrime = true;
                    bw.write(n+"\n");
                }
            }
        }

        bw.close();
        br.close();
    }
}
