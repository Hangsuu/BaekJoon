package step.function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Function25501 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			sb.append(isPalindrome(s)+"\n");
		}
		br.close();
		bw.write(sb.toString());
		bw.close();
	}
	
    public static String recursion(String s, int l, int r){
        if(l >= r) return "1 "+(l+1);
        else if(s.charAt(l) != s.charAt(r)) return "0 "+(l+1);
        else return recursion(s, l+1, r-1);
    }
    
    public static String isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}