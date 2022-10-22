package Ex10;

public class Computer {
    private String brand;
    private int price;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;

    Computer(int price, String brand, String speed, String memory, String size) {
        this.brand = brand;
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

    public String getBrand() {
        return brand;
    }

    public String toString() {
        return "Brand: " + brand + "\nPrice: " + price + "\nProcessor speed: " + getSpeed() + "\nMemory: " + getMemory() + "\nMonitor size: " + getSize();
    }
}