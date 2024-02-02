package step.queue;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Deque2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> number = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            deque.addLast(i);
            number.add(Integer.parseInt(s[i]));
        }
        int num = 0;
        for(int i=0; i<n-1; i++) {
            if(num > 0) {
                for(int j=0; j<num; j++) {
                    if(j != num-1) {
                        deque.addLast(deque.pollFirst());
                    } else {
                        int ballNumber = deque.pollFirst();
                        num = number.get(ballNumber);
                        bw.write(ballNumber+1 + " ");
                        break;
                    }
                }
            } else if(num < 0) {
                for(int j=0; j<-num; j++) {
                    if(j != -num-1) {
                        deque.addFirst(deque.pollLast());
                    } else {
                        int ballNumber = deque.pollLast();
                        num = number.get(ballNumber);
                        bw.write(ballNumber+1 + " ");
                        break;
                    }
                }
            } else {
                int ballNumber = deque.pollFirst();
                num = number.get(ballNumber);
                bw.write(ballNumber+1 + " ");
            }
        }
        bw.write(deque.peek()+1 + " ");
        bw.close();
        br.close();
    }
}
