package step.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Deque24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        Queue<String> queue = new LinkedList<>();
        for(int i=n-1; i>=0; i--) {
            if(a[i].equals("0")) {
                queue.add(b[i]);
            }
        }
        int m = Integer.parseInt(br.readLine());
        String[] c = br.readLine().split(" ");
        for(int i=0; i<m; i++) {
            queue.add(c[i]);
            bw.write(queue.poll()+ " ");
        }
        bw.close();
        br.close();
    }
}
