package step.stack;

import java.io.*;
import java.util.Stack;

public class Stack28278 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> num = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = 0;
            if(s.length == 2) {
                b = Integer.parseInt(s[1]);
            }

            switch (a) {
                case 1 :
                    num.push(b);
                    break;
                case 2 :
                    if(num.size() > 0) {
                        bw.write(num.pop() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case 3 :
                    bw.write(num.size() + "\n");
                    break;
                case 4 :
                    if(num.size() == 0) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case 5 :
                    if(num.size() > 0) {
                        bw.write(num.peek() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
            }
        }
        bw.close();
        br.close();
    }
}
