package step.math;

import java.io.*;

public class Math1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numLine1 = br.readLine().split(" ");
        String[] numLine2 = br.readLine().split(" ");

        int num1 = Integer.parseInt(numLine1[0]) * Integer.parseInt(numLine2[1])
                + Integer.parseInt(numLine2[0]) * Integer.parseInt(numLine1[1]);
        int num2 = Integer.parseInt(numLine1[1]) * Integer.parseInt(numLine2[1]);

        int smaller = Math.min(num1, num2);
        for(int i=smaller; i>0; i--) {
            if(num1%i == 0 && num2%i ==0) {
                num1 /= i;
                num2 /= i;
                break;
            }
        }

        bw.write(num1 + " " + num2);
        br.close();
        bw.close();
    }
}
