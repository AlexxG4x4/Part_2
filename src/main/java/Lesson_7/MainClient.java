package Lesson_7;

import java.io.IOException;

public class MainClient {
    public static void main(String[] args){
        Client client = null;
        client = new Client();

        Chat chatInterface = new Chat();
        chatInterface.initField(client);
        client.startClient(chatInterface);
    }
}