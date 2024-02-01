package step.queue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Deque28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<String> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            switch(s[0]) {
                case "1" :
                    deque.addFirst(s[1]);
                    break;
                case "2" :
                    deque.addLast(s[1]);
                    break;
                case "3" :
                    bw.write(deque.size() > 0 ? deque.poll()+"\n" : "-1\n");
                    break;
                case "4" :
                    bw.write(deque.size() > 0 ? deque.pollLast()+"\n" : "-1\n");
                    break;
                case "5" :
                    bw.write(deque.size() + "\n");
                    break;
                case "6" :
                    bw.write(deque.size() > 0 ? "0\n" : "1\n");
                    break;
                case "7" :
                    bw.write(deque.size() > 0 ? deque.peekFirst()+"\n" : "-1\n");
                    break;
                case "8" :
                    bw.write(deque.size() > 0 ? deque.peekLast()+"\n" : "-1\n");
                    break;
                default: break;
            }
        }
        bw.close();
        br.close();
    }
}
