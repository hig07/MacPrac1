package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sudoku {
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[][] A = new int[9][9];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 9; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        update(0, 0);
    }

    public static void update(int row, int col){
        if(col == 9){
            update(row + 1, 0);
            return;
        }

        if(row == 9){
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    sb.append(A[i][j]).append(" ");
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);
        }
    }

    public static void check(){

    }
}

/* 
2차원 배열
i 열의 9개 행을 체크
3X3 배열 체크 => 
행 0-2 / 3-5 / 6-8
열 0-2 / 3-5 / 6-8
부족한 숫자를 update
출력
*/