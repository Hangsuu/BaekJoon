package reference;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedWriterEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		bw.write(s);
		bw.write(1+2+"");	//String을 입력받기 때문에 int의 형변환 필수
		bw.write("\n");	//줄띄우기	
		bw.newLine();	//줄띄우기
		bw.flush();		//필수
		bw.close();		//필수
	}
}