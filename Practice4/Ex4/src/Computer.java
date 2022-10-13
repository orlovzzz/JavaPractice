public class Computer {
    private int price;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;

    Computer(int price, String speed, String memory, String size) {
        this.price = price;
        this.memory = new Memory(memory);
        this.monitor = new Monitor(size);
        this.processor = new Processor(speed);
    }

    public int getPrice() {
        return price;
    }

    public String getMemory() {
        return memory.getMemory();
    }

    public String getSize() {
        return monitor.getSize();
    }

    public String getSpeed() {
        return processor.getSpeed();
    }

    public String toString() {
        return "Price: " + price + "\nProcessor speed: " + getSpeed() + "\nMemory: " + getMemory() + "\nMonitor size: " + getSize();
    }
}