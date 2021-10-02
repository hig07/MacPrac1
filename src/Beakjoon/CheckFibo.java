package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckFibo {
    static int cnt0;
    static int cnt1;
    static int cnt;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(cnt0).append(' ').append(cnt1).append('\n');
        }
        System.out.println(sb);
    }
    public static void fibonacci(int N){
        cnt0 = 1;
        cnt1 = 0;
        cnt = 1;
        
        for(int i = 0; i < N; i++){
            cnt0 = cnt1;
            cnt = cnt0 + cnt1;
            cnt1 = cnt;
        }
    }
}
