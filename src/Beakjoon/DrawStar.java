package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DrawStar {
    static StringBuilder[] sb;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(br.readLine());
        sb = new StringBuilder[A];

        String s = String.format("%" + A + "s", ' ');
        
        for(int i = 0; i < A; i++){
            sb[i] = new StringBuilder(s);
        }
        star(0, 0, A);

        for(int i = 0; i < A; i++){
            System.out.println(sb[i]);
        }
    }

    static void star(int x, int y, int A){
        if(A == 1){
            sb[x].setCharAt(y, '*');
            return;
        }

        int size = A / 3;
        int cnt = 0;

        for(int i = x; i < x + A; i += size){
            for(int j = y; j < y + A; j += size){
                cnt++;
                if(cnt != 5){
                    star(i, j, size);
                }
            }
        }
    }
}

//System.out.println();