package step.stack;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> leftLine = new Stack<>();
        Queue<Integer> rightLine = new LinkedList<Integer>();

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            rightLine.add(Integer.parseInt(s[i]));
        }

        int count = 1;
        boolean canFinish = false;

        while(true) {
            int leftPeek = leftLine.size() > 0 ? leftLine.peek() : 0;
            int rightPeek = rightLine.size() > 0 ? rightLine.peek() : 0;
            if(leftPeek == count) {
                leftLine.pop();
                count ++;
            } else if(rightPeek == count) {
                rightLine.poll();
                count ++;
            } else {
                leftLine.add(rightLine.poll());
            }

            if(leftLine.size() == 0 && rightLine.size() == 0) {
                canFinish = true;
                break;
            } else if(rightLine.size() == 0 && leftLine.peek() != count) {
                break;
            }
        }

        if(canFinish) {
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }
        bw.close();
        br.close();
    }
}
