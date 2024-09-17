package laptop;

public class LaptopConfigurator {
    public static void configureLaptop(LaptopBuilder builder) {
        builder.setProcessor("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated Graphics")
                .build();
    }
}
