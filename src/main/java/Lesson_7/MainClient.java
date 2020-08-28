package Lesson_7;

public class MainClient {
    public static void main(String[] args){
        Client client = null;
        client = new Client();

        Chat chatInterface = new Chat();
        chatInterface.initField(client);
        client.startClient(chatInterface);
    }
}