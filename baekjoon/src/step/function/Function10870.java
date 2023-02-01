package step.function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Function10870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		bw.write(Fibo(n)+"");
		bw.close();
	}
	
	public static int Fibo(int n) {
		if(n==0) return 0;
		else if(n==1 || n==2) return 1;
		else return Fibo(n-1)+Fibo(n-2);
	}
}