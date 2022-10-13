public class Person {
    private String fullName;
    private int age;

    Person() {}

    Person(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public void move() {
        System.out.println("Person " + this.fullName + " " + this.age + " years old speaking.");
    }

    public void talk() {
        System.out.println("Person " + this.fullName + " " + this.age + " years old speaking.");}
}
