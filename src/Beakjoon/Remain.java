package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Remain {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int i = 0; i < 10; i++){
            hashSet.add((Integer.parseInt(br.readLine()) % 42));
        }
        
        System.out.println(hashSet.size());
    }
}
/* 
기본적인 방법은 나머지가 나올 수 있는 수는 0~41 이므로 길이가 42 인 boolean 배열을 생성한다.

(참고로 boolean 배열의 default 값은 false 이다.)

그리고 입력받은 값의 %42 을 통한 나머지 값의 index 을 true 로 바꾸어 준 뒤, 입력이 종료되면 true 값인 배열원소의 개수를 세어준다.
*/