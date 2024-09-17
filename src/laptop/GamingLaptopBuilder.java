package laptop;

public class GamingLaptopBuilder extends LaptopBuilder {

    @Override
    public Laptop build() {
        return new Laptop(processor, RAM, storage, graphicsCard);
    }
}
