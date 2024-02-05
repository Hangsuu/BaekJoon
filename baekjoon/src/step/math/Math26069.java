package step.math;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Math26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> rainbow = new HashSet<>();
        rainbow.add("ChongChong");
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            if(rainbow.contains(s[0])) {
                rainbow.add(s[1]);
            } else if(rainbow.contains(s[1])) {
                rainbow.add(s[0]);
            }
        }
        bw.write(rainbow.size() + "");
        bw.close();
        br.close();
    }
}
