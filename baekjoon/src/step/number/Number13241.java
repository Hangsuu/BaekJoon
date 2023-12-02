package step.number;

import java.io.*;

public class Number13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");

        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);

        long smaller = 0L;
        long bigger = 0L;

        long multi = 0L;
        if(a < b) {
            smaller = a;
            bigger = b;
        } else {
            smaller = b;
            bigger = a;
        }

        for(int i=1; i<=smaller; i++) {
            if((bigger*i)%smaller == 0) {
                multi = bigger*i;
                break;
            }
        }

        bw.write(multi+"");
        bw.close();
        br.close();
    }
}
