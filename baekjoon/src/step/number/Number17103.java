package step.number;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number17103 {

    private static List<Integer> primeList = new ArrayList<>();
    private static Set<Integer> primeSet = new HashSet<>();
    public static void main(String[] args) throws IOException {
        primeList.add(2);
        primeSet.add(2);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            while(primeList.get(primeList.size()-1) < n) {
                addNewPrime();
            }
            for(int j=0; j<primeList.size(); j++) {
                int a = primeList.get(j);
                if(a > n/2) {
                    break;
                }
                if(primeSet.contains(n-a)) {
                    count ++;
                }
            }
            bw.write(count + "\n");
        }

        br.close();
        bw.close();
    }

    private static void addNewPrime() {
        int biggestPrime = primeList.get(primeList.size()-1);
        int newPrime = biggestPrime+1;
        while(true) {
            boolean findPrime = true;
            for(int j=2; j<Math.sqrt(newPrime)+1; j++) {
                if(newPrime % j == 0) {
                    newPrime ++;
                    findPrime = false;
                    break;
                }
            }
            if(findPrime) {
                primeList.add(newPrime);
                primeSet.add(newPrime);
                break;
            }
        }
    }
}
