package Programmers;

public class Keypad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int size = numbers.length;
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;
        int L_dist, R_dist;

        for(int i = 0; i < size; i++){
            L_dist = 0;
            R_dist = 0;
            
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                sb.append("L");
                left = numbers[i];
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                sb.append("R");
                right = numbers[i];
            }
            else{
                if(numbers[i] == 0){
                    numbers[i] += 11;
                }
                L_dist = (Math.abs(numbers[i] - left)) / 3 + (Math.abs(numbers[i] - left)) % 3;
				R_dist = (Math.abs(right - numbers[i])) / 3 + (Math.abs(right - numbers[i])) % 3;
				if(L_dist == R_dist) {
					if(hand.equals("right")) {
						sb.append("R");
						right = numbers[i];
					}else {
						sb.append("L");
						left = numbers[i];
					}
				}else if(L_dist > R_dist) {
					sb.append("R");
					right = numbers[i];
				}else {
					sb.append("L");
					left = numbers[i];
				}
            }
        }
        answer += sb;
        return answer;
    }
}
