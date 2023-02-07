package step.geo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Geo3053 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int r = Integer.parseInt(br.readLine());
		double circle = r*r*Math.PI;
		double taxi = r*r*2.0;
		bw.write(circle+"\n"+taxi);
		bw.close();
		br.close();
	}
}