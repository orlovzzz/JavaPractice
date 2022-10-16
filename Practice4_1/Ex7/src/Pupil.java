public class Pupil {
    protected int age;
    protected char name;

    Pupil(int age, char name) {
        this.name = name;
        this.age = age;
    }

    public char getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }
}
