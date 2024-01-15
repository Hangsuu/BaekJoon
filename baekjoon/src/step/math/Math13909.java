package step.math;

import java.io.*;

public class Math13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = (int) Math.sqrt(n);

        bw.write(count+"");
        br.close();
        bw.close();
    }
}
