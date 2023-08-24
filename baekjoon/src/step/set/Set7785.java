package step.set;

import java.io.*;
import java.util.*;

public class Set7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new TreeSet<>();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String[] s = br.readLine().split(" ");
            if("enter".equals(s[1])){
                set.add(s[0]);
            } else {
                set.remove(s[0]);
            }
        }
        List<String> list = new ArrayList<>(set);
        //Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        Collections.sort(list, Collections.reverseOrder());
        for(String name : list){
            bw.write(name+"\n");
        }
        bw.close();
        br.close();
    }
}
