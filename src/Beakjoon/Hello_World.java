package Beakjoon;

public class Hello_World {
    public static void main(String[] args){
        int a = 1234;
        int sum = a;

        while(a != 0){
            sum += a % 10;
            System.out.print(sum + " ");
            a = a/10;
            System.out.println(a);
        }
    }
}
