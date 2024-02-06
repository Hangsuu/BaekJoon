package step.recursive;

import java.io.*;

public class Recursive27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(factorial(1L, n) + "");
        bw.close();
        br.close();
    }

    private static long factorial(long answer, int n) {
        if(n > 1) {
            return factorial(answer * n, n-1);
        } else {
            return answer;
        }
    }
}
