public class Person {
    private String Name;
    private int Age;
    private int Height;
    private int Weight;
    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public int getHeight() {
        return Height;
    }
    public void setHeight(int height) {
        Height = height;
    }
    public int getWeight() {
        return Weight;
    }
    public void setWeight(int weight) {
        Weight = weight;
    }

    public Person(String name, int age, int height, int weight) {
        Name = name;
        Age = age;
        Height = height;
        Weight = weight;
    }
}
