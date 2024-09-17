package laptop;

public class Laptop {
    private String processor;
    private String RAM;
    private String storage;
    private String graphicsCard;

    // Constructor
    public Laptop(String processor, String RAM, String storage, String graphicsCard) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Laptop [Processor=" + processor + ", RAM=" + RAM + ", Storage=" + storage + ", Graphics Card="
                + graphicsCard + "]";
    }
}
