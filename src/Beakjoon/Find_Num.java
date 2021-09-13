package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_Num {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String result = Integer.toString(A * B * C);
        int[] arr = new int[10];
        
        for(int i = 0; i < result.length(); i++){
            arr[(result.charAt(i) - '0')]++;
        }

        for(int v : arr){
            System.out.println(arr[v]);
        }

        //System.out.println(result.length());
        //for(int i = 0; i < result.length(); i++){
        //    System.out.println(arr[i]);
        //}
    }
}
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];

		int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

		String str = String.valueOf(val);

		for (int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - '0')]++;
		}

		for (int v : arr) {
			System.out.println(v);
		} 
        */
