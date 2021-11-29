package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];

        int result = decomposition(arr, 1, N);
        System.out.println(result);
    }

    static int decomposition(int[] arr, int n, int N){  //각 자연수 n-N까지의 분해합 구함, 값을 arr에 저장
        int result = 1;
        
        for(int i = n; i <= N; i++){
            arr[i] = 0;
        }

        for(int i = n; i <= N; i++){
            String str = Integer.toString(i);
            int sum = i;

            for(int j = 0; j < str.length(); j++){
                sum += str.charAt(j) - '0';
            }

            if(arr[i] != 0){
                continue;
            }
            else{
                arr[i] = sum;  //i가 1일 때 sum은 2 -> 1은 2의 생성자 -> 인덱스 1에 분해합인 2 입력, 2에 4
            }
        }

        while(arr[result] != N){
            result++;
            if(result > N){
                return 0;
            }
        }

        return result;
    }
}
/*  그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 
예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다.
N의 가장 작은 생성자를 구하기   */