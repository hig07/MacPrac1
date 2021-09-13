import java.util.Scanner;

public class tutorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("학생 수 : ");
        int number = scan.nextInt();
        Student[] students = new Student[number];
        for(int i = 0; i < number; i++){
            students[i] = new Student("name", 20 + i, 170 + i, 60 - i, i + "", 1 + i, 4.5);
        }
        for(int i = 0; i < number; i++){
            students[i].show();
        }
        scan.close();
    }
}
