package step.math;

import java.io.*;

public class Math24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = (int) Math.pow(2, n);
        bw.write(answer + "");
        bw.close();
        br.close();
    }
}
