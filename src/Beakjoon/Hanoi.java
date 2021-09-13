package Beakjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hanoi {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        bw.write((int) (Math.pow(2, A) - 1) + "\n");

        hanoi(A, 1, 2, 3);

        bw.flush();
        bw.close();
    }

    public static void hanoi(int A, int start, int mid, int end) throws IOException{  
        //hanoi(n) = 2 * hanoi(n - 1) + 1 -> hanoi(n) = 2 ^ n - 1
        if(A == 1){
            bw.write(start + " " + end + " " + "\n");
            return;
        }
        hanoi(A - 1, start, end, mid);

        bw.write(start + " " + end + "\n");

        hanoi(A - 1, mid, start, end);
    }
}
