package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
 
		char[] b = B.toCharArray();
		
		System.out.println(A * (b[2]-'0'));
		System.out.println(A * (b[1] - '0'));
		System.out.println(A * (b[0]-'0'));
		System.out.println(A * Integer.parseInt(B));
    }
}

        /*
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

        System.out.println(A*(B%10));
        System.out.println(A*((B%100)/10));
        System.out.println(A*(B%100));
        System.out.println(A*B);
        */