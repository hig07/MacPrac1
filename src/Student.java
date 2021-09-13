public class Student extends Person{
    private String StudentID;
    private int Grade;
    private double GPA;
    
    public String getStudentID() {
        return StudentID;
    }
    public void setStudentID(String studentID) {
        StudentID = studentID;
    }
    public int getGrade() {
        return Grade;
    }
    public void setGrade(int grade) {
        Grade = grade;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double gPA) {
        GPA = gPA;
    }

    public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
        super(name, age, height, weight);
        StudentID = studentID;
        Grade = grade;
        GPA = gPA;
    }
    
    public void show(){
        System.out.println("------------------------");
        System.out.println("학생 이름 : " + getName());
        System.out.println("학생 나이 : " + getAge());
        System.out.println("학생 키 : " + getHeight());
        System.out.println("학생 몸무게 : " + getWeight());
        System.out.println("학번 : " + getStudentID());
        System.out.println("학년 : " + getGrade());
        System.out.println("학점 : " + getGPA());
    }
}
