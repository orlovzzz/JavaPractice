public class SchoolBoy extends Pupil {
    private String pupilClass;

    SchoolBoy(char name, int age, String pupilClass) {
        super(age, name);
        this.pupilClass = pupilClass;
    }

    public String getPupilClass() {
        return pupilClass;
    }

    @Override
    public String toString() {
        return super.toString() + ", class: " + pupilClass + ".";
    }
}
