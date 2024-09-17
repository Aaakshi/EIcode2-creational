package laptop;

public abstract class LaptopBuilder {
    protected String processor;
    protected String RAM;
    protected String storage;
    protected String graphicsCard;

    public LaptopBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public LaptopBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public LaptopBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public LaptopBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public abstract Laptop build();
}
