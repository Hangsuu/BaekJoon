package step.back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Back2580_2 {
	static int[][] arr = new int[9][9];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<9; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for(int j=0; j<9; j++){
	        	arr[i][j] = Integer.parseInt(st.nextToken());
	        }
		}
		sudoku(0, 0);
		br.close();
	}
	
	public static void sudoku(int n, int m) throws IOException {
		if(n==9) {
			StringBuffer sb = new StringBuffer();
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					sb.append(arr[i][j]+" ");
				}
				sb.append("\n");
			}
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			bw.write(sb.toString());
			bw.close();
			System.exit(0);
		}
		if(m==9) {
			sudoku(n+1, 0);
			return;
		}
		if(arr[n][m]==0) {
			for(int j=1; j<=9; j++) {
				if(trueNum(n, m, j)) {
					arr[n][m]=j;
					sudoku(n, m+1);
				}
			}
			arr[n][m]=0;
			return;
		}
		sudoku(n, m+1);
	}
	public static boolean trueNum(int n, int m, int num) {
		for(int k=0; k<9; k++) {
			if(arr[n][k]==num || arr[k][m]==num) {
				return false;
			}
		}
		for(int l=n/3*3; l<n/3*3+3; l++) {
			for(int o=m/3*3; o<m/3*3+3; o++) {
				if(arr[l][o]==num) {
					return false;
				}
			}
		}
		return true;
	}
}