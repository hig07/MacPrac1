package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deq = new LinkedList<Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++){
            deq.offer(i);
        }

        int[] arr = new int[M];

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == deq.poll()){
                
            }
        }
        System.out.println(cnt);
    }
}
