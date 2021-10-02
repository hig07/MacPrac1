package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DPcoloring {
    final static int R = 0;
    final static int G = 1;
    final static int B = 2;

    static int[][] dp;
    static int[][] result;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

		result = new int[T][3];
		dp = new int[T][3];

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            dp[i][R] = Integer.parseInt(st.nextToken());
            dp[i][G] = Integer.parseInt(st.nextToken());
            dp[i][B] = Integer.parseInt(st.nextToken());
        }

        dp[0][R] = result[0][R];
        dp[0][G] = result[0][G];
        dp[0][B] = result[0][B];

        System.out.println(Math.min(coloring(T - 1, R), Math.min(coloring(T - 1, G), coloring(T - 1, B))));
    }

    static int coloring(int T, int color){
        if(dp[T][color] == 0){
            if(color == R){
                dp[T][R] = Math.min(coloring(T - 1, G), coloring(T - 1, B)) + result[T][R];
            }
            else if(color == B){
                dp[T][B] = Math.min(coloring(T - 1, R), coloring(T - 1, G)) + result[T][B];
            }
            else{
                dp[T][G] = Math.min(coloring(T - 1, R), coloring(T - 1, B)) + result[T][G];
            }
        }
        return dp[T][color];
    }
}

/* 
조건 1. 인접 집과 같은색이면 안됨
2. 각 라인 별로 최솟값
*/