package Programmers;

public class Test1 {
    class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {0, 0, 0};
            int[] check = new int[4];
            int max = 0;
    
            for(int i = 0; i < arr.length; i++){
                check[arr[i]]++;
            }
    
            for(int i = 1; i <=3; i++){
                if(check[i] > max){
                    max = check[i];
                }
            }
    
            for(int i = 0; i < 3; i++){
                answer[i] = max - check[i + 1];
            }
    
            return answer;
        }
    }
}
