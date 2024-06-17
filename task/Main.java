package week7.task;

import week7.task.common.SimpleHttpServer;
import week7.task.service.HttpServerService;
import week7.task.service.impl.HttpserverImpl;
//This sets up the server to listen for incoming connections
// and handle them accordingly using the logic defined in HttpserverImpl.
public class Main {
    public static void main(String[] args) {
        HttpserverImpl service  = new HttpserverImpl();
        service.start(SimpleHttpServer.P0RT);
    }
}
