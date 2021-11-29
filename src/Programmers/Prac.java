package Programmers;

public class Prac {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = new int[10000];
        int[] two = new int[10000];
        int[] three = new int[10000];
        int tmp = 1;

        one[0] = 1;
        two[0] = 2;
        three[0] = 3;

        for(int i = 1; i < 10000; i++){
            if(i % 5 != 0){
                one[i] = i % 5;
            }
            else{
                one[i] = 5;
            }

            if(i % 2 != 0){
                if(tmp == 2){
                    tmp++;
                }
                else if(tmp > 5){
                    tmp = 1;
                }
                two[i] = tmp;
                tmp++;
            }
            else{
                two[i] = 2;
            }
        }

        return answer;
    }
}
