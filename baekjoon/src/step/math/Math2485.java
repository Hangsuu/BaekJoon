package step.math;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Math2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(br.readLine());
        List<Integer> position = new ArrayList<>();
        List<Integer> narrow = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<line; i++) {
            int temp = Integer.parseInt(br.readLine());
            position.add(temp);
            if(i!=0) {
                int narrowTemp = temp - position.get(i-1);
                narrow.add(narrowTemp);
                min = Integer.min(min, narrowTemp);
            }
        }
        int divisor = 1;

        for(int i=min; i>1; i--) {
            int finished = 0;
            for(int j=0; j<narrow.size(); j++) {
                if(narrow.get(j)%i != 0) {
                    break;
                }
                if(j == narrow.size() -1) {
                    divisor = i;
                    finished = 1;
                }
            }
            if(finished == 1) {
                break;
            }
        }

        int count = 0;
        for(int i=0; i<narrow.size(); i++) {
            count += narrow.get(i)/divisor -1;
        }
        bw.write(count + "");
        bw.close();
        br.close();
    }
}
