package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FunnyDP {
    static int[][][] dp = new int[21][21][21];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            if(a == -1 && b == -1 && c == -1){
                break;
            }
            sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(funny(a ,b ,c)).append('\n');
        }
        System.out.println(sb);
    }

    public static int funny(int a, int b, int c){
        if(inRange(a, b, c) && dp[a][b][c] != 0){
            return dp[a][b][c];
        }
        if(a <= 0 || b <= 0 || c <= 0){
            return 1;
        }
        if(a > 20 || b > 20 || c > 20){
            return dp[20][20][20] = funny(20, 20, 20);
        }
        if(a < b && b < c){
            return dp[a][b][c] = funny(a, b, c-1) + funny(a, b-1, c-1) - funny(a, b-1, c);
        }
        return dp[a][b][c] = funny(a-1, b, c) + funny(a-1, b-1, c) + funny(a-1, b, c-1) - funny(a-1, b-1, c-1);
    }

    public static boolean inRange(int a, int b, int c){
        return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }
}
/*
동적계획법 - DP
메모이제이션을 활용 => 배열을 활용
동적계획법 문제를 풀기위한 가장 기본 단계 3개만 알고있으면 된다.

1. 점화식 찾기 (동적계획법의 핵심은 반복되는 계산을 줄이는 것이기 때문에 대부분 점화식으로 표현이 가능하다.)

2. 점화식에서 반복되는 수식 확인하기 

3. 점화식을 재귀식으로 옮기면서 반복되는 수식은 메모리에 저장하기 (재귀 말고 반복문으로도 변환이 가능하지만, 일단은 재귀로 옮기는 연습부터 하는 것을 추천한다.)
*/