public class Manager extends Employer{
    private double avgSum;

    Manager(String firstName, String secondName, int income, double avgSum) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.income = income;
        this.avgSum = avgSum;
    }

    @Override
    public double getIncome() {
        return avgSum + income;
    }
}
