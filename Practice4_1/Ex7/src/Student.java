public class Student extends Pupil{
    private String group;

    Student(char name, int age, String group) {
        super(age, name);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return super.toString() + ", group: " + group + ".";
    }
}
