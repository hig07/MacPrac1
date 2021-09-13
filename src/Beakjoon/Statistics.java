package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Statistics {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  //N은 홀수라고 가정하자.
        double at_mean = 0;
        int median = 0;
        int mode = 0;
        int range = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] cnt = new int[8001];

        for(int i = 0; i < N; i++){
            arr.add(Integer.parseInt(br.readLine()));
            cnt[arr.get(i) + 4000]++;
        }
        
        at_mean = AT_mean(arr, N);
        median = Median(arr, N);
        mode = Mode(cnt, N);
        range = Range(arr, N);

        System.out.println((int) at_mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }

    static double AT_mean(ArrayList<Integer> arr, int N){
        //산술평균(arithmetic mean) : N개의 수들의 합을 N으로 나눈 값, 소수점 이하 첫째 자리에서 반올림한 값을 출력
        double result = 0.0;

        for(int i = 0; i < N; i++){
            result += arr.get(i);
        }
        result = result / N;

        return Math.round(result);
    }
    static int Median(ArrayList<Integer> arr, int N){
        //중앙값(median) : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값, 중앙값을 출력
        Collections.sort(arr);
        return arr.get(((N + 1) / 2) - 1);
    }
    static int Mode(int[] cnt, int N){
        //최빈값(mode) : N개의 수들 중 가장 많이 나타나는 값, 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력
        int max = 0;
        int result = 10000;
        boolean flag = false;

        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] > 0){
                if(max < cnt[i]){
                    max = cnt[i];
                    result = i - 4000;
                    flag = true;
                }
                else if(max == cnt[i] && flag == true){
                    result = i - 4000;
                    flag = false;
                }
            }
        }

        return result;
    }
    static int Range(ArrayList<Integer> arr, int N){
        //범위(range) : N개의 수들 중 최댓값과 최솟값의 차이, 범위를 출력
        Collections.sort(arr);
        return (arr.get(N - 1) - arr.get(0));
    }
}

//System.out.println();