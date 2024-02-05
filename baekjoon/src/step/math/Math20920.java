package step.math;

import java.io.*;
import java.util.*;

public class Math20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++) {
            String word = br.readLine();
            if(word.length() >= m) {
                if(map.isEmpty() || !map.containsKey(word)) {
                    map.put(word, 1);
                } else {
                    map.replace(word, map.get(word) + 1);
                }
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> {
            if(map.get(a) != map.get(b)) {
                return -(map.get(a) - map.get(b));
            } else if(a.length() != b.length()) {
                return -(a.length() - b.length());
            } else {
                return a.compareTo(b);
            }
        });

        for (String word : list) {
            bw.write(word + "\n");
        }
        bw.close();
        br.close();
    }
}
