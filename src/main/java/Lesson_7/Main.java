package Lesson_7;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
            Server srv = new Server();
            try {
                srv.startServer();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}