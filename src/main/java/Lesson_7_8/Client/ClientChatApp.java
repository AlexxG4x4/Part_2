package Lesson_7_8.Client;

import Lesson_7_8.Client.Service.ClientService;
import java.io.IOException;

public class ClientChatApp {

    public static void main(String[] args) throws IOException {
        ClientService clientService = new ClientService();
        clientService.startGraphic();
    }
}