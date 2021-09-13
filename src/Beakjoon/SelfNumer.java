package Beakjoon;

public class SelfNumer {
    public static int selfNum(int num){
        int result = num;

        while(num != 0){
            result += num % 10;
            num = num / 10;
        }
        return result;        
    }
    public static void main(String[] args){
        boolean[] arr = new boolean[10001];

        for(int i = 1; i < 10001; i++){
            int n = selfNum(i);

            if(selfNum(i) < 10001){
                arr[n] = true;
            }
        }

        for(int i = 1; i < 10001; i++){
            if(arr[i] == false){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}
