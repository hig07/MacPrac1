package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen {
    static int[] arr;
    static int N;
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        queen(0);
        System.out.println(count);
    }
    public static void queen(int depth){
        if(depth == N){
            count++;
            return;
        }
        for(int i = 0; i < N; i++){
            arr[depth] = i;
            if(possible(depth)){
                queen(depth + 1);
            }
        }
    }
    public static boolean possible(int column){
        for(int i = 0; i < column; i++){
            if(arr[column] == arr[i]){
                return false;
            }
            else if(Math.abs(column - i) == Math.abs(arr[column] - arr[i])){
                return false;
            }
        }
        return true;
    }
}
