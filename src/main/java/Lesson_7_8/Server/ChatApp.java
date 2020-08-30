package Lesson_7_8.Server;

import Lesson_7_8.Server.Service.ServerImpl;

import java.io.IOException;

public class ChatApp {

    public static void main(String[] args) throws IOException {
        new ServerImpl();
    }
}