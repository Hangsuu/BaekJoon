package step.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back15649_1 {
    static int N,M;
    static int numArr[];
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numArr = new int[M];
        visited = new boolean[N];


        dfs(N,M,0);

        System.out.println(sb);
    }
    static void dfs(int n, int m, int depth) {
        if(depth == M) { //차원이 끝났으면 numArr에 있는 숫자 출력
            for(int i : numArr) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;	//0depth로 돌아가서 for문 마저 실행
        }
        
        for(int i=0; i<n; i++) {	
        	if(!visited[i]) {		//depth차원 숫자가 사용된 숫자가 아니라면
        		visited[i]=true;	//사용된 숫자가 다시 사용 안되게 막고
        		numArr[depth]=i+1;	//depth차원 숫자 선택
        		dfs(n, m, depth+1);	//다음 차원 숫자 선택하러 ㄱㄱ
        		visited[i]=false;	//이번 차원은 끝났으니 다시 원복
        	}
        }
    }
}
