package step.etc;

import java.io.*;

public class Etc1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int difX = Math.abs((y-1)/4-(x-1)/4);
        int difY = Math.abs((y-1)%4-(x-1)%4);
        bw.write((difX+difY)+"");
        bw.close();
        br.close();
    }
}
