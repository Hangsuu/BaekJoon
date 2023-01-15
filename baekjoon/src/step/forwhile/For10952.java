package step.forwhile;

import java.io.*;

public class For10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String s;
			String[] sa;
			try {
				s = br.readLine();
				sa = s.split(" ");
			}
			catch(Exception e) {
				break;
			}
			
			int a = Integer.parseInt(sa[0]);
			int b = Integer.parseInt(sa[1]);
			bw.write(a+b+"");
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}