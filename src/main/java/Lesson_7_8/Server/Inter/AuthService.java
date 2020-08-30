package Lesson_7_8.Server.Inter;

public interface AuthService {

    void start();
    String getNick(String login, String password);
    void stop();
}