package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Array1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //int A = Integer.parseInt(br.readLine());
        StringTokenizer st;
        //StringBuilder sb = new StringBuilder();

        //ArrayList<Integer> array = new ArrayList<>();
        //ArrayList<Integer> copy = new ArrayList<>();
        int[] array = new int[9];
        int[] copy;
        int index = 0;
        int cnt = 0;

        while(index < 9){
            st = new StringTokenizer(br.readLine());
            array[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        copy = array;

        Arrays.sort(array);

        for(int i = 0; i < copy.length; i++){
            if(array[8] == copy[cnt]){
                break;
            }
            else{
                cnt++;
            }
        }

        System.out.println(array[8]);
        System.out.println(cnt);
    }
}
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];
        
        int max = 0;
        int index = 0;
        int cnt = 0;

        for(int i = 0; i < 9; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        for(int value : array){
            cnt++;
            if(value > max){
                max = value;
                index = cnt;
            }
        }

        System.out.println(max);
        System.out.println(index);
*/