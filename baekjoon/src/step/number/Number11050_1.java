package step.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number11050_1 {
    public static int N, K;
    public static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dp = new int[N+1][K+1];
        int answer = findAnswer(N, K);
        System.out.println(answer);
    }
    private static int findAnswer(int n, int k) {
        if(dp[n][k]>0) {
            return dp[n][k];
            //배열 기본값 0이 아니면 사용
        }
        if(k==0 || n==k) {
            return dp[n][k]=1; //파스칼삼각형 맨 윗줄 1 입력
        }
        return dp[n][k]=findAnswer(n-1, k-1) + findAnswer(n-1, k);
    }	//윗줄 두개 합
}