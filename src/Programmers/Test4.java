package Programmers;

public class Test4 {
    public static void main(String[] args){
        int rows = 3;
        int columns = 4;

        int[][] result = solution(rows, columns);

        for(int i = 0; i < rows; i++){
            System.out.println();
            for(int j = 0; j < columns; j++){
                System.out.print(result[i][j] + " ");
            }
        }
    }
    public static int[][] solution(int rows, int columns) {
        int[][] answer = new int[rows][columns];
        int n = 0;
        int m = 0;
        answer[n][m] = 1;
        int tmp = 1;
        int cnt;

        while(true){
            cnt = 0;
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    if(answer[i][j] == 0){
                        cnt++;
                    }
                }
            }
            if(cnt == 0){
                break;
            }
            if(tmp % 2 == 0){
                if(++n < rows){
                    answer[n][m] = tmp++;
                }
                else{
                    n = 0;
                    answer[n][m] = tmp++;
                }
            }
            else{
                if(++m < columns){
                    answer[n][m] = tmp++;
                }
                else{
                    m = 0;
                    answer[n][m] = tmp++;
                }
            }
        }
        
        return answer;
    }
}
