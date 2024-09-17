import chatbot.Chatbot;
import chatbot.ChatbotFactory;
import laptop.Laptop;
import laptop.GamingLaptopBuilder;
import laptop.OfficeLaptopBuilder;
import laptop.LaptopBuilder;

public class main {
    public static void main(String[] args) {
        // Demonstrating the Chatbot (Factory Pattern)
        Chatbot studyChatbot = ChatbotFactory.getChatbot("study");
        studyChatbot.provideResources();

        // Demonstrating the Laptop Configuration (Builder Pattern)
        LaptopBuilder gamingLaptopBuilder = new GamingLaptopBuilder()
                .setProcessor("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080");
        Laptop gamingLaptop = gamingLaptopBuilder.build();
        System.out.println("Gaming Laptop Configured: " + gamingLaptop);

        LaptopBuilder officeLaptopBuilder = new OfficeLaptopBuilder()
                .setProcessor("Intel i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated Graphics");
        Laptop officeLaptop = officeLaptopBuilder.build();
        System.out.println("Office Laptop Configured: " + officeLaptop);
    }
}
