package Lesson_7_8.Server.Inter;

import Lesson_7_8.Server.Handler.ClientHandler;
import Lesson_7_8.Server.Service.AuthServiceImpl;

public interface Server {

    int PORT = 8080;

    boolean isNickBusy(String Nick);

    void broadcastClientList();

    void broadcastMsg(String msg);

    void subcribe(ClientHandler client);

    void unsubcribe(ClientHandler client);

    void sndMsgToClient(ClientHandler from, String to, String msg);

    AuthServiceImpl getAuthService();
}