package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP_Triangle {
    static Integer[][] dp;
    static int[][] result;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        dp = new Integer[n][n];
        result = new int[n][n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < i + 1; j++){
                result[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < n; i++){
            dp[n - 1][i] = result[n - 1][i];
        }
        System.out.println(sum(0, 0));
    }

    public static int sum(int depth, int index){
        if(depth == n - 1){
            return dp[depth][index];
        }
        if(dp[depth][index] == null){
            dp[depth][index] = Math.max(sum(depth + 1, index), sum(depth + 1, index + 1)) + result[depth][index];
        }
        return dp[depth][index];
    }
}
