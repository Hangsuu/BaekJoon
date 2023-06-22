package step.etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Etc1408 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		String a = br.readLine();
		
		int timeA = Integer.parseInt(a.substring(0, 2))*3600+Integer.parseInt(a.substring(3, 5))*60+Integer.parseInt(a.substring(6));
		String b = br.readLine();
		int timeB = Integer.parseInt(b.substring(0, 2))*3600+Integer.parseInt(b.substring(3, 5))*60+Integer.parseInt(b.substring(6));
		long time = timeB-timeA;
		if(time<0) {
			time+=3600*24;
		}
		DecimalFormat df = new DecimalFormat("00");
		StringBuffer sb = new StringBuffer();
		sb.append(df.format(time/3600)+":"+df.format(time%3600/60)+":"+df.format(time%3600%60));
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
}
