package Programmers;

public class Prac1 {
    public static void main(String[] args){
        String answer = "";
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        for(int i = 0; i < participant.length; i++){
            answer = participant[i];
            for(int j = 0; j < completion.length; i++){
                if(participant[i] == completion[j]){
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
