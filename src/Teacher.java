public class Teacher extends Person{
    private String TeacherID;
    private int MonthSalary;
    private int WorkedYear;
    
    public String getTeacherID() {
        return TeacherID;
    }
    public void setTeacherID(String teacherID) {
        TeacherID = teacherID;
    }
    public int getMonthSalary() {
        return MonthSalary;
    }
    public void setMonthSalary(int monthSalary) {
        MonthSalary = monthSalary;
    }
    public int getWorkedYear() {
        return WorkedYear;
    }
    public void setWorkedYear(int workedYear) {
        WorkedYear = workedYear;
    }

    public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workedYear) {
        super(name, age, height, weight);
        TeacherID = teacherID;
        MonthSalary = monthSalary;
        WorkedYear = workedYear;
    }
    
    public void show(){
        System.out.println("------------------------");
        System.out.println("교사 이름 : " + getName());
        System.out.println("교사 나이 : " + getAge());
        System.out.println("교사 키 : " + getHeight());
        System.out.println("교사 몸무게 : " + getWeight());
        System.out.println("교직원 번호 : " + getTeacherID());
        System.out.println("월급 : " + getMonthSalary());
        System.out.println("연차 : " + getWorkedYear());
    }
}
