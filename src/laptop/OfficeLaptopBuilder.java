package laptop;

public class OfficeLaptopBuilder extends LaptopBuilder {

    @Override
    public Laptop build() {
        return new Laptop(processor, RAM, storage, graphicsCard);
    }
}
