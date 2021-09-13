package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Constant {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String A = st.nextToken();
        String B = st.nextToken();
        
        System.out.println(change(A, B));
    }

    public static int change(String str1, String str2){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < 3; i++){
            sb1.append(str1.charAt(2 - i) - '0');
            sb2.append(str2.charAt(2 - i) - '0');
        }

        if(Integer.parseInt(sb1.toString()) > Integer.parseInt(sb2.toString())){
            return Integer.parseInt(sb1.toString());
        }
        else{
            return Integer.parseInt(sb2.toString());
        }
    }
}

//System.out.println();

/* 
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
StringTokenizer st = new StringTokenizer(br.readLine()," ");

int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

System.out.print(A > B ? A:B);
*/

/* 
int A = 0;
int B = 0;

A += System.in.read() - 48;
A += (System.in.read() - 48)*10;
A += (System.in.read() - 48)*100;

System.in.read();	// 공백

B += System.in.read() - 48;
B += (System.in.read() - 48)*10;
B += (System.in.read() - 48)*100;

System.out.println(A > B ? A : B);
*/