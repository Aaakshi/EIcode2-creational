package chatbot;

public class ChatbotFactory {
    public static Chatbot getChatbot(String type) {
        if (type.equalsIgnoreCase("study")) {
            return new StudyResourceChatbot();
        }
        // You can add more chatbot types here
        return null;
    }
}
