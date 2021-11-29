package Programmers;

public class Test2 {

    public static void main(String[] args){
        String[] log = {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
        String result = solution(log);

        System.out.println(result);
    }

    public static String solution(String[] log) {
        String answer = "";
        String[] arr;
        int[] check = new int[log.length];
        int result = 0;

        for(int i = 0; i < log.length; i++){
            arr = log[i].split(":");

            for(int j = 0; j < 2; j++){
                System.out.println(arr[j]);
            }

            check[i] = (Integer.parseInt(arr[0]) * 60) + Integer.parseInt(arr[1]);
            System.out.println(check[i]);
        }

        for(int i = 1; i < check.length; i += 2){
            if(check[i] - check[i - 1] < 5){
                result += 0;
            }
            else if(check[i] - check[i - 1] > 105){
                result += 105;
            }
            else{
                result += check[i] - check[i - 1];
            }
            System.out.println(result);
        }
        answer = transform(result);

        return answer;
    }
    public static String transform(int result){
        String str = "";
        int hour = result / 60;
        int min = result % 60;

        if(hour < 1){
            str = "00:" + String.valueOf(min);
            return str;
        }
        else{
            if(hour < 10){
                if(min < 10){
                    str = "0" + String.valueOf(hour) + ":0" + String.valueOf(min);
                }
                else{
                    str = "0" + String.valueOf(hour) + ":" + String.valueOf(min);
                }
            }
            else{
                if(min < 10){
                    str = String.valueOf(hour) + ":0" + String.valueOf(min);
                }
                else{
                    str = String.valueOf(hour) + ":" + String.valueOf(min);
                }
            }
            return str;
        }
    }
}
