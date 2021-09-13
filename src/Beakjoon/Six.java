package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Six {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = find(N);
        System.out.println(result);
    }
    static int find(int N){
        int result = 0;
        int cnt = 0;
        while(cnt != N){
            result += 1;
            if(Integer.toString(result).contains("666")){
                cnt++;
            }
        }
        return result;
    }
}
