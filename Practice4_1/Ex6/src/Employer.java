public class Employer {
    protected String firstName;
    protected String secondName;
    protected int income;

    Employer(String firstName, String secondName, int income) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.income = income;
    }

    public Employer() {}

    public double getIncome() {
        return income;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
