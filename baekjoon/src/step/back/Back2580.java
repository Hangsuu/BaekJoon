package step.back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Back2580 {
	static int[][] arr = new int[9][9];
	static int[][] ans = new int[9][9];
	static List<Integer> list = new ArrayList<>();
	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<9; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for(int j=0; j<9; j++){
	        	int temp = Integer.parseInt(st.nextToken());
	        	arr[i][j] = temp;
	        	if(temp==0) list.add(i*10+j);
	        }
		}
		sudoku(0);
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				sb.append(ans[i][j]+" ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.close();
		br.close();
	}
	
	public static void sudoku(int depth) {
		if(depth==list.size()) {
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					ans[i][j]=arr[i][j];
				}
			}
			return;
		}
		for(int i=depth; i<list.size(); i++) {
			int n = list.get(i)/10;
			int m = list.get(i)%10;
			int temp=0;
			for(int j=1; j<=9; j++) {
				int count=0;
				temp=j;
				for(int k=0; k<9; k++) {
					if(arr[n][k]==j || arr[k][m]==j) {
						count++;
						break;
					}
				}
				for(int l=n/3*3; l<n/3*3+3; l++) {
					for(int o=m/3*3; o<m/3*3; m++) {
						if(arr[l][o]==j) {
							count++;
							break;
						}
					}
				}
				if(count==0) {
					arr[n][m]=temp;
					sudoku(depth+1);
					arr[n][m]=0;
				}
			}
		}
	}
}