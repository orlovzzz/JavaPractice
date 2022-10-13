public class Phone {
    Phone(String number, String model, String weight) {
        this.weight = weight;
        new Phone(number, model);
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {};
    private String number;
    private String model;
    private String weight;

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public String getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Call from " + name + ".");
    }

    public void receiveCall(String name, String number){
        System.out.println("Call from " + name + ". Number: " + number);
    }

    public void sendMessage(String number) {
        System.out.println("Send message to " + number + ".");
    }
}
